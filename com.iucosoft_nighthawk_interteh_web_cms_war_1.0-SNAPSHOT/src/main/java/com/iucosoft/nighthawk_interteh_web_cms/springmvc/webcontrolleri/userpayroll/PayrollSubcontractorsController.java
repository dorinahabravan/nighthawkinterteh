
package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.userpayroll;

import com.iucosoft.nighthawk_interteh_service.entities.Subcontractor;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWUserServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.SubcontractorServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.dto.SubcontractorDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.SubcontractorConvertor;
import com.iucosoft.nighthawk_interteh_web_cms.dto.validator.SubcontractorFormValidator;
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

/**
 *
 * @author Dorina
 */
@Controller
@RequestMapping("/userpayroll/payrollsubcontractors")
public class PayrollSubcontractorsController {
    
    
    
      private final Logger logger = LoggerFactory.getLogger(PayrollSubcontractorsController.class);

    @Autowired
    SubcontractorServiceIntf subcontractorService;

    @Autowired
    NWUserServiceIntf nwuserService;

    @Autowired
    SubcontractorConvertor subcontractorConvertor;

    @Autowired
    SubcontractorFormValidator subcontractorFormValidator;

 

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.setValidator((Validator) subcontractorFormValidator);
    }

 

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ModelAndView list() {

        ModelAndView mv = new ModelAndView("userpayroll.payrollsubcontractors.list.def");
        try {
            List<Subcontractor> lista = subcontractorService.list();

            List<SubcontractorDTO> subcontractorDTOList = subcontractorConvertor.convert(lista);
            mv.addObject("subcontractorDTOList", subcontractorDTOList);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return mv;
    }

    @RequestMapping(value = "/showView", method = RequestMethod.GET)
    String showView() {

      
        return "userpayroll.payrollsubcontractors.showView.def";
    }
    
    
    /**
     * Show an Subcontractor
     */
    @RequestMapping(value = "/showView/{idSubcontractor}", method = RequestMethod.GET)
    String showView(@PathVariable("idSubcontractor") int idSubcontractor, Model model) {

        logger.debug("showView() idSubcontractor: {}", idSubcontractor);

        Subcontractor subcontractor = subcontractorService.findById(idSubcontractor);
        if (subcontractor == null) {

            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Subcontractor not found");

        } else {
            SubcontractorDTO subcontractorDTO = subcontractorConvertor.convert(subcontractor);
            model.addAttribute("subcontractor", subcontractorDTO);

        }

        return "userpayroll.payrollsubcontractors.showView.def";
    }
    
    
    /**
     * Save or Update Subcontractor *
     *
     * //////////////////////
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
//    public String saveOrUpdateRole(@ModelAttribute("edit") @Validated NWRoleDTO nwRoleDTO,
    public String saveOrUpdateSubcontractor(@ModelAttribute("subcontractorDTO") @Validated SubcontractorDTO subcontractorDTO,
            BindingResult result, Model model, final RedirectAttributes redirectAttributes) {

        logger.debug("saveOrUpdateSubcontractor() : {}", subcontractorDTO);

        if (result.hasErrors()) {
//            populateDefaultModel(model);
            return "userpayroll.payrollsubcontractors.showEdit.def";
        } else {

            redirectAttributes.addFlashAttribute("css", "success");
            if (subcontractorDTO.getIdSubcontractor() == null) {
                redirectAttributes.addFlashAttribute("msg", "Subcontractor added successfully!");
            } else {
                redirectAttributes.addFlashAttribute("msg", "Subcontractor updated successfully!");
            }

            Subcontractor subcontractor = subcontractorConvertor.convert(subcontractorDTO);
            subcontractorService.saveOrUpdate(subcontractor);

            return "redirect:/userpayroll/payrollsubcontractors/list";

        }

    }

    /**
     *
     * Add Subcontractor
     */
    @RequestMapping(value = "/showAddNewSubcontractor", method = RequestMethod.GET)
    String showAddNewSubcontractor(
            Model model) {

        SubcontractorDTO subcontractorDTO = new SubcontractorDTO();
        model.addAttribute("subcontractorDTO", subcontractorDTO);

        return "userpayroll.payrollsubcontractors.showEdit.def";
    }

    @RequestMapping(value = "/showEdit", method = RequestMethod.GET)
    String showEdit() {

       
        return "userpayroll.payrollsubcontractors.showEdit.def";
    }
    
    
     /**
     * showEdit Buton cu numele Update in sens de arata pentru a fi editat
     */
    @RequestMapping(value = "/showEdit/{idSubcontractor}", method = RequestMethod.GET)
    String showEdit(@PathVariable("idSubcontractor") int idSubcontractor, Model model) {

        Subcontractor subcontractor = subcontractorService.findById(idSubcontractor);
        if (subcontractor == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Subcontractor not found");

        } else {
            SubcontractorDTO subcontractorDTO = subcontractorConvertor.convert(subcontractor);
            model.addAttribute("subcontractorDTO", subcontractorDTO);

        }

        return "userpayroll.payrollsubcontractors.showEdit.def";
    }

    /**
     *
     * Delete Subcontractor
     *
     */
    @RequestMapping(value = "/delete/{idSubcontractor}", method = RequestMethod.GET)
    public String delete(@PathVariable("idSubcontractor") int idSubcontractor, final RedirectAttributes redirectAttributes) {

        System.out.println("delete() : {}" + idSubcontractor);

        subcontractorService.delete(idSubcontractor);

        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "Subcontractor is deleted!");

        return "redirect:/userpayroll/payrollsubcontractors/list";

    }

   
}
