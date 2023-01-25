package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.admin;

import com.iucosoft.nighthawk_interteh_service.entities.NWRole;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWRoleServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.dto.NWRoleDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.NWRoleConvertor;
import com.iucosoft.nighthawk_interteh_web_cms.dto.validator.NWRoleFormValidator;
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
@RequestMapping("/admin/nwroles")
public class NWRolesController {

    private final Logger logger = LoggerFactory.getLogger(NWRolesController.class);

    @Autowired
    NWRoleFormValidator nwRoleFormValidator;

    //Intrebare: @InitBinder controleaza requesturile pentru o forma sau si pentru un field aparte?
    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator((Validator) nwRoleFormValidator);
    }

    @Autowired
    NWRoleServiceIntf nwroleService;

    @Autowired
    NWRoleConvertor nwRoleConvertor;

    /**
     * Show the list of Roles
     *
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ModelAndView list() {

        ModelAndView mv = new ModelAndView("admin.nwroles.list.def");
        try {
            List<NWRole> lista = nwroleService.list();

//            for (NWRole nWRole : lista) {
////                System.out.println(nWRole);
//                logger.debug(nWRole.toString());
//            }

//            System.out.println("Am intrat in metoda roles!" + new Date());
            List<NWRoleDTO> nwRoleDTOList = nwRoleConvertor.convert(lista);

            mv.addObject("nwRoleDTOList", nwRoleDTOList);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return mv;
    }

    /**
     * Show an Role
     */
    @RequestMapping(value = "/showView/{userRoleId}", method = RequestMethod.GET)
    String showView(@PathVariable("userRoleId") int userRoleId, Model model) {

        logger.debug("showView() userRoleId: {}", userRoleId);

        NWRole role = nwroleService.findById(userRoleId);
        if (role == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Role not found");

        } else {
            NWRoleDTO nwRoleDTO = nwRoleConvertor.convert(role);
            model.addAttribute("role", nwRoleDTO);

        }

        return "admin.nwroles.showView.def";
    }

    /**
     * Save or Update Role *
     *
     *
     * @param nwRoleDTO
     * @param result
     * @param model
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
//    public String saveOrUpdateRole(@ModelAttribute("edit") @Validated NWRoleDTO nwRoleDTO,
    public String saveOrUpdateRole(@ModelAttribute("nwRoleDTO") @Validated NWRoleDTO nwRoleDTO,
            BindingResult result, Model model, final RedirectAttributes redirectAttributes) {

        logger.debug("saveOrUpdateRole() : {}", nwRoleDTO);

        if (result.hasErrors()) {
//            populateDefaultModel(model);
            return "admin.nwroles.showEdit.def";
        } else {

            redirectAttributes.addFlashAttribute("css", "success");
            if (nwRoleDTO.getUserRoleId() == null) {
                redirectAttributes.addFlashAttribute("msg", "Role added successfully!");
            } else {
                redirectAttributes.addFlashAttribute("msg", "Role updated successfully!");
            }

            NWRole nwRole = nwRoleConvertor.convert(nwRoleDTO);
            nwroleService.saveOrUpdate(nwRole);

            // POST/REDIRECT/GET
            return "redirect:/admin/nwroles/list";

            // POST/FORWARD/GET
            // return "user/list";
        }

    }

    @RequestMapping(value = "/showAddNewRole", method = RequestMethod.GET)
    String showAddNewRole(Model model) {

//        NWRole nWRole = new NWRole();
//        nWRole.setEnabled(true);
        NWRoleDTO nwRoleDTO = new NWRoleDTO();
//        nwRoleDTO.setEnabled(true);
        model.addAttribute("nwRoleDTO", nwRoleDTO);

        return "admin.nwroles.showEdit.def";
    }

    /**
     * showEdit Buton cu numele Update in sens de arata pentru a fi editat
     */
    @RequestMapping(value = "/showEdit/{userRoleId}", method = RequestMethod.GET)
    String showEdit(@PathVariable("userRoleId") int userRoleId, Model model) {
        NWRole role = nwroleService.findById(userRoleId);
        if (role == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Role not found");

        } else {
            NWRoleDTO nwRoleDTO = nwRoleConvertor.convert(role);
            model.addAttribute("nwRoleDTO", nwRoleDTO);

        }

        return "admin.nwroles.showEdit.def";
    }

    /**
     *
     * Delete Role
     *
     * @param userRoleId
     * @param redirectAttributes
     * @return
     */
    @RequestMapping(value = "/delete/{userRoleId}", method = RequestMethod.GET)
    public String deleteRole(@PathVariable("userRoleId") int userRoleId, final RedirectAttributes redirectAttributes) {

//        logger.debug("deleteRole() : {}", userRoleId);
        System.out.println("deleteRole() : {}" + userRoleId);

        nwroleService.delete(userRoleId);

        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "Role is deleted!");

        return "redirect:/admin/nwroles/list";

    }

    /**
     * Disable Role
     *
     */
    @RequestMapping(value = "/disable/{userRoleId}", method = RequestMethod.GET)
    public String disableRole(@PathVariable("userRoleId") int userRoleId, final RedirectAttributes redirectAttributes) {

//        logger.debug("deleteRole() : {}", userRoleId);
        System.out.println("disableRole() : {}" + userRoleId);

        NWRole nWRole = nwroleService.findById(userRoleId);
//        nWRole.setEnabled(false);

        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "Role is disabled!");

        return "redirect:/admin/nwroles/list";

    }

//    private void populateDefaultModel(Model model) {
//
//        
//
//        model.addAttribute("", );
//
//    }
}
