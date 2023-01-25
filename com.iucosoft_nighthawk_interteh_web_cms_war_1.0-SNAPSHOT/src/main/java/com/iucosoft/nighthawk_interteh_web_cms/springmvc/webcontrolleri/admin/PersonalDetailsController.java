package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.admin;

import com.iucosoft.nighthawk_interteh_service.entities.Administrator;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.AdministratorServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWUserServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.dto.AdministratorDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.AdministratorConvertor;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.NWUserConvertor;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Se ocupa de editarea listei si dateor administratorilor.CRUD pentru
 * Administrator
 *
 * @author Dorina
 */
@Controller
@RequestMapping("/admin/personaldetails")
public class PersonalDetailsController {

    private final Logger logger = LoggerFactory.getLogger(PersonalDetailsController.class);

    @Autowired
    AdministratorServiceIntf administratorService;

    @Autowired
    NWUserServiceIntf nwuserService;

    @Autowired
    AdministratorConvertor administratorConvertor;
    
    @Autowired
    NWUserConvertor nWUserConvertor;

    /**
     * Show PersonalDetails
     *
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ModelAndView list() {

        ModelAndView mv = new ModelAndView("admin.personaldetails.list.def");
        try {
            List<Administrator> lista = administratorService.list();

            List<AdministratorDTO> administratorDTOList = administratorConvertor.convert(lista);
            mv.addObject("administratorDTOList", administratorDTOList);
        } catch (Exception e) {
            e.printStackTrace();

        }
        return mv;
    }

    /**
     * Show PersonalDetails
     */
    @RequestMapping(value = "/showView/{idAdministrator}", method = RequestMethod.GET)
    String showView(@PathVariable("idAdministrator") int idAdministrator, Model model) {

        logger.debug("showView() idAdministrator: {}", idAdministrator);

        Administrator admin = administratorService.findById(idAdministrator);
        if (admin == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Administrator not found");

        } else {
            AdministratorDTO administratorDTO = administratorConvertor.convert(admin);
            model.addAttribute("admin", administratorDTO);

        }

        return "admin.personaldetails.showView.def";
    }

    /**
     * Save or Update Personal Details *
     *
     *
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String saveOrUpdate(@ModelAttribute("administratorDTO") AdministratorDTO administratorDTO, BindingResult result,
            Model model, final RedirectAttributes redirectAttributes) {

        logger.debug("saveOrUpdate() : {}", administratorDTO);

        if (result.hasErrors()) {
            return "admin.personaldetails.showEdit.def";

        } else {

            redirectAttributes.addFlashAttribute("css", "success");
            if (administratorDTO.getIdAdministrator() == null) {
                redirectAttributes.addFlashAttribute("msg", "Administrator added successfully!");

            } else {
                redirectAttributes.addFlashAttribute("msg", "Administrator updated successfully!");
            }

            Administrator administrator = administratorConvertor.convert(administratorDTO);
            administratorService.saveOrUpdate(administrator);

        }

        return "redirect:/admin/personaldetails/list";

    }

    @RequestMapping(value = "/showAddNewAdministrator", method = RequestMethod.GET)
    String showAddNewAdministrator(Model model) {

        AdministratorDTO administratorDTO = new AdministratorDTO();
        model.addAttribute("administratorDTO", administratorDTO);

        return "admin.personaldetails.showEdit.def";
    }

    /**
     *
     * showEdit Buton cu numele Update in sens de arata pentru a fi editat
     */
    @RequestMapping(value = "/showEdit/{idAdministrator}", method = RequestMethod.GET)
    String showEdit(@PathVariable("idAdministrator") int idAdministrator, Model model) {

        Administrator admin = administratorService.findById(idAdministrator);
        if (admin == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Administrator not found");

        } else {
            AdministratorDTO administratorDTO = administratorConvertor.convert(admin);
            model.addAttribute("administratorDTO", administratorDTO);
        }

        return "admin.personaldetails.showEdit.def";
    }

    @RequestMapping(value = "/delete/{idAdministrator}", method = RequestMethod.POST)
    public String deleteAdministrator(@PathVariable("idAdministrator") int idAdministrator,
            final RedirectAttributes redirectAttributes) {

        logger.debug("delete() : {}", idAdministrator);

        administratorService.delete(idAdministrator);

        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "Administrator is deleted!");

        return "redirect:/admin/personaldetails/list";

    }
}
