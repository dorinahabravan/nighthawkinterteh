package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.admin;

import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWUserServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.dto.NWUserDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.NWUserConvertor;
import com.iucosoft.nighthawk_interteh_web_cms.dto.validator.NWUserFormValidator;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/admin/nwusers")
public class NWUsersController {

    private final Logger logger = LoggerFactory.getLogger(NWUsersController.class);

    @Autowired
NWUserFormValidator nWUserFormValidator;

    //Intrebare: @InitBinder controleaza requesturile pentru o forma sau si pentru un field aparte?
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator((Validator) nWUserFormValidator);
    }

    @Autowired
    NWUserServiceIntf nwuserService;

    @Autowired
    NWUserConvertor nWUserConvertor;

    /**
     * Show the list of Users
     *
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ModelAndView list() {

        ModelAndView mv = new ModelAndView("admin.nwusers.list.def");
        try {
            List<NWUser> lista = nwuserService.list();

            List<NWUserDTO> nwUserDTOList = nWUserConvertor.convert(lista);

            mv.addObject("nwUserDTOList",nwUserDTOList);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return mv;
    }

    /**
     * Show an User
     */
    @RequestMapping(value = "/showView/{idUser}", method = RequestMethod.GET)
    String showView(@PathVariable("idUser") int idUser, Model model) {

        logger.debug("showView() idUser: {}", idUser);

        NWUser user = nwuserService.findById(idUser);
        if (user == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "User not found");

        } else {
            NWUserDTO nwUserDTO = nWUserConvertor.convertor(user);
            model.addAttribute("user", nwUserDTO);

        }

        return "admin.nwusers.showView.def";
    }

    /**
     * Save or Update User *
     *
     *
     * 
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
//    public String saveOrUpdateRole(@ModelAttribute("edit") @Validated NWRoleDTO nwRoleDTO,
    public String saveOrUpdateUser(@ModelAttribute("nwUserDTO") @Validated NWUserDTO nwUserDTO,
            BindingResult result, Model model, final RedirectAttributes redirectAttributes) {

        logger.debug("saveOrUpdateUser() : {}", nwUserDTO);

        if (result.hasErrors()) {
//            populateDefaultModel(model);
            return "admin.nwusers.showEdit.def";
        } else {

            redirectAttributes.addFlashAttribute("css", "success");
            if (nwUserDTO.getIdUser() == null) {
                redirectAttributes.addFlashAttribute("msg", "User added successfully!");
            } else {
                redirectAttributes.addFlashAttribute("msg", "User updated successfully!");
            }

            NWUser nwUser = nWUserConvertor.convertor(nwUserDTO);
            nwuserService.saveOrUpdate(nwUser);

            // POST/REDIRECT/GET
            return "redirect:/admin/nwusers/list";

            // POST/FORWARD/GET
            // return "user/list";
        }

    }

    @RequestMapping(value = "/showAddNewUser", method = RequestMethod.GET)
    String showAddNewUser(Model model) {


        NWUserDTO nwUserDTO = new NWUserDTO();
;
        model.addAttribute("nwUserDTO", nwUserDTO);

        return "admin.nwusers.showEdit.def";
    }

    /**
     * showEdit Buton cu numele Update in sens de arata pentru a fi editat
     */
    @RequestMapping(value = "/showEdit/{idUser}", method = RequestMethod.GET)
    String showEdit(@PathVariable("idUser") int idUser, Model model) {
        NWUser user = nwuserService.findById(idUser);
        if (user == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "User not found");

        } else {
            NWUserDTO nwUserDTO = nWUserConvertor.convertor(user);
            model.addAttribute("nwUserDTO", nwUserDTO);

        }

        return "admin.nwusers.showEdit.def";
    }

    /**
     *
     * Delete User
     *
     * @param userRoleId
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/delete/{idUser}", method = RequestMethod.GET)
    public String deleteUser(@PathVariable("idUser") int idUser, final RedirectAttributes redirectAttributes) {

//        logger.debug("deleteRole() : {}", userRoleId);
        System.out.println("deleteUser() : {}" + idUser);

        nwuserService.delete(idUser);

        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "User is deleted!");

        return "redirect:/admin/nwusers/list";

    }

    /**
     * Disable Role
     *
     */
    @RequestMapping(value = "/disable/{idUser}", method = RequestMethod.GET)
    public String disableUser(@PathVariable("idUser") int idUser, final RedirectAttributes redirectAttributes) {

        logger.debug("deleteUser() : {}", idUser);
//        System.out.println("disableUser() : {}" + idUser);

        NWUser nWUser = nwuserService.findById(idUser);


        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "User is disabled!");

        return "redirect:/admin/nwusers/list";

    }


}
