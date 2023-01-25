package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.admin;

import com.iucosoft.nighthawk_interteh_service.entities.Payroll;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.PayrollServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.dto.PayrollDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.PayrollConvertor;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.ServletRequestDataBinder;
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
@RequestMapping("/admin/payroll")
public class PayrollController {

    private final Logger logger = LoggerFactory.getLogger(PayrollController.class);

    @Autowired
    PayrollServiceIntf payrollService;

    @Autowired
    PayrollConvertor payrollConvertor;

    /**
     * Show the list of Payroll
     *
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ModelAndView list() {

        ModelAndView mv = new ModelAndView("admin.payroll.list.def");
        try {
            List<Payroll> lista = payrollService.list();

            List<PayrollDTO> payrollDTOList = payrollConvertor.convert(lista);

            mv.addObject("payrollDTOList", payrollDTOList);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return mv;
    }

    /**
     * Show an Payroll
     */
    @RequestMapping(value = "/showView/{idPayroll}", method = RequestMethod.GET)
    String showView(@PathVariable("idPayroll") int idPayroll, Model model) {

        logger.debug("showView() idPayroll: {}", idPayroll);

        Payroll payroll = payrollService.findById(idPayroll);
        if (payroll == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Payroll not found");

        } else {

            PayrollDTO payrollDTO = payrollConvertor.convert(payroll);
            model.addAttribute("payroll", payrollDTO);
        }
        return "admin.payroll.showView.def";
    }

    /**
     * Save or Update Role
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)

    public String saveOrUpdatePayroll(@ModelAttribute("payrollDTO") PayrollDTO payrollDTO,
            BindingResult result, Model model, final RedirectAttributes redirectAttributes) {

        logger.debug("saveOrUpdatePayroll() : {}", payrollDTO);

        if (result.hasErrors()) {

            return "admin.payroll.showEdit.def";
        } else {

            redirectAttributes.addFlashAttribute("css", "success");
            if (payrollDTO.getIdPayroll() == null) {
                redirectAttributes.addFlashAttribute("msg", "Payroll added successfully!");
            } else {
                redirectAttributes.addFlashAttribute("msg", "Payroll updated successfully!");
            }

            Payroll payroll = payrollConvertor.convert(payrollDTO);
            payrollService.saveOrUpdate(payroll);

            return "redirect:/admin/payroll/list";

        }

    }

    /**
     * Add Payroll
     */
    @RequestMapping(value = "/showAddNewPayroll", method = RequestMethod.GET)
    String showAddNewPayroll(Model model) {

        PayrollDTO payrollDTO = new PayrollDTO();
        model.addAttribute("payrollDTO", payrollDTO);

        return "admin.payroll.showEdit.def";
    }

    /**
     * showEdit Buton cu numele Update in sens de arata pentru a fi editat
     */
    @RequestMapping(value = "/showEdit/{idPayroll}", method = RequestMethod.GET)
    String showEdit(@PathVariable("idPayroll") int idPayroll, Model model) {

        Payroll payroll = payrollService.findById(idPayroll);
        if (payroll == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Payroll not found");

        } else {
            PayrollDTO payrollDTO = payrollConvertor.convert(payroll);
            model.addAttribute("payrollDTO", payrollDTO);

        }

        return "admin.payroll.showEdit.def";
    }

    /**
     * Delete Payroll
     */
    @RequestMapping(value = "/delete/{idPayroll}", method = RequestMethod.GET)
    public String delete(@PathVariable("idPayroll") int idPayroll, final RedirectAttributes redirectAttributes) {

        logger.debug("delete() : {}", idPayroll);

        payrollService.delete(idPayroll);

        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "Payroll is deleted!");

        return "redirect:/admin/payroll/list";

    }
    
    
    
       /*
    Am convertit Date  pein anotatii ;a clasa enitatate si metoda initBinder() in formatul care il avea  String care a fost trnasmis pe pagina JSP
    
    */
     @InitBinder
     public void initBinderDate(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormatP = new SimpleDateFormat("yyyy-MM-dd");
        dateFormatP.setLenient(false);
        binder.registerCustomEditor(Date.class,null, new CustomDateEditor( dateFormatP, true));
    }
    
}
    
    
    

