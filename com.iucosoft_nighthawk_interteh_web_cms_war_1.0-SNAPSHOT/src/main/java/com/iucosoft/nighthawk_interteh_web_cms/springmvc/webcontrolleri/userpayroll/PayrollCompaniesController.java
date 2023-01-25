package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.userpayroll;

import com.iucosoft.nighthawk_interteh_service.entities.Employercompany;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.EmployercompanyServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.dto.EmployercompanyDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.EmployercompanyConvertor;
import com.iucosoft.nighthawk_interteh_web_cms.dto.validator.EmployercompanyFormValidator;
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
@RequestMapping("/userpayroll/payrollcompanies")
public class PayrollCompaniesController {

    
    
     private final Logger logger = LoggerFactory.getLogger(PayrollCompaniesController.class);

    @Autowired
    EmployercompanyServiceIntf employerCompanyService;

    @Autowired
    EmployercompanyConvertor employercompanyConvertor;
    
    @Autowired
    EmployercompanyFormValidator employercompanyFormValidator;
    
    @InitBinder
     protected void initBinder(WebDataBinder binder) {
        binder.setValidator((Validator) employercompanyFormValidator);
    }
   

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ModelAndView list() {

        ModelAndView mv = new ModelAndView("userpayroll.payrollcompanies.list.def");
        try {
             List<Employercompany> lista = employerCompanyService.list();
            List<EmployercompanyDTO> employercompanyDTOList = employercompanyConvertor.convert(lista);
            mv.addObject("employercompanyDTOList", employercompanyDTOList);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return mv;
    }

 
    
    
    
     @RequestMapping(value = "/showView/{idClientCompany}", method = RequestMethod.GET)
    String showView(@PathVariable("idClientCompany") int idClientCompany, Model model) {

        logger.debug("showView() idClientCompany: {}", idClientCompany);

        Employercompany employerCompany = employerCompanyService.findById(idClientCompany);
        if (employerCompany == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Company not found");
        } else {

            EmployercompanyDTO employercompanyDTO = employercompanyConvertor.convert(employerCompany);

            model.addAttribute("employercompanyDTO", employercompanyDTO);
        }

        return "userpayroll.payrollcompanies.showView.def";
    }

    
     @RequestMapping(value = "/edit", method = RequestMethod.POST)

    public String saveOrUpdateCompany(@ModelAttribute("employercompanyDTO") @Validated EmployercompanyDTO employercompanyDTO,
            BindingResult result, Model model, final RedirectAttributes redirectAttributes) {

        logger.debug("saveOrUpdateCompany() : {}", employercompanyDTO);

        if (result.hasErrors()) {
            return "userpayroll.payrollcompanies.showEdit.def";
        } else {

            redirectAttributes.addFlashAttribute("css", "success");
            if (employercompanyDTO.getIdClientCompany() == null) {
                redirectAttributes.addFlashAttribute("msg", "Company added successfully!");
            } else {
                redirectAttributes.addFlashAttribute("msg", "Company updated successfully!");
            }

            Employercompany employercompany = employercompanyConvertor.convert(employercompanyDTO);
            employerCompanyService.saveOrUpdate(employercompany);

            return "redirect:/userpayroll/payrollcompanies/list";

        }
    }

    @RequestMapping(value = "/showAddNewCompany", method = RequestMethod.GET)
    String showAddNewCompany(Model model) {

        EmployercompanyDTO employercompanyDTO = new EmployercompanyDTO();
        model.addAttribute("employercompanyDTO", employercompanyDTO);

        return "userpayroll.payrollcompanies.showEdit.def";
    }
    
    
    
    @RequestMapping(value = "/showEdit", method = RequestMethod.GET)
    String showEdit() {

       
        return "userpayroll.payrollcompanies.showEdit.def";
    }

    //Modifies an role
    @RequestMapping(value = "/edit", method = RequestMethod.GET)
    String edit() {

      
        return "userpayroll.payrollcompanies.edit.def";
    }
    
    
    
    
     @RequestMapping(value = "/showEdit/{idClientCompany}", method = RequestMethod.GET)
    String showEdit(@PathVariable("idClientCompany") int idClientCompany, Model model) {
        Employercompany employercompany = employerCompanyService.findById(idClientCompany);
        if (employercompany == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Company not found");

        } else {
            EmployercompanyDTO employercompanyDTO = employercompanyConvertor.convert(employercompany);
            model.addAttribute("employercompanyDTO", employercompanyDTO);

        }

        return "userpayroll.payrollcompanies.showEdit.def";
    }

    /**
     *
     * Delete Company
     *
     */
    @RequestMapping(value = "/delete/{idClientCompany}", method = RequestMethod.GET)
    public String deleteCompany(@PathVariable("idClientCompany") int idClientCompany, final RedirectAttributes redirectAttributes) {

//        logger.debug("deleteRole() : {}", userRoleId);
        System.out.println("deleteCompany() : {}" + idClientCompany);

        employerCompanyService.delete(idClientCompany);

        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "Company is deleted!");

        return "redirect:/userpayroll/payrollcompanies/list";

    }

}
