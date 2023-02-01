package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.userpayroll;

import com.iucosoft.nighthawk_interteh_service.entities.Payment;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.PaymentServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.dto.PaymentDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.PaymentConvertor;
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
import org.springframework.validation.annotation.Validated;
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
@RequestMapping("/userpayroll/payrollpayments")
public class PayrollPaymentsController {
    
    
     private final Logger logger = LoggerFactory.getLogger(PayrollPaymentsController.class);

     @Autowired
     PaymentConvertor paymentConvertor;


    
//    @InitBinder
//     protected void initBinder(WebDataBinder binder) {
//        binder.setValidator((Validator) contractsFormValidator);
//    }

    @Autowired
    PaymentServiceIntf paymentService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ModelAndView list() {

        ModelAndView mv = new ModelAndView("userpayroll.payrollpayments.list.def");
        try {
            List<Payment> lista = paymentService.list();
            List<PaymentDTO> paymentDTOList = paymentConvertor.convert(lista);
            mv.addObject("paymentDTOList", paymentDTOList);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return mv;
    }

  
    
    
    
    @RequestMapping(value = "/showView/{idPayment}", method = RequestMethod.GET)
    String showView(@PathVariable("idPayment") int idPayment, Model model) {

        logger.debug("showView() idPayment: {}", idPayment);

        Payment payment = paymentService.findById(idPayment);
        if (payment == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Contract not found");

        } else {

            PaymentDTO paymentDTO = paymentConvertor.convert(payment);
            model.addAttribute("paymentDTO", paymentDTO);

        }

        return  "userpayroll.payrollpayments.showView.def";
    }
    
    
      /**
     * Save or Update Contract *
     *
     *
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)

    public String saveOrUpdateContract(@ModelAttribute("paymentDTO") @Validated PaymentDTO paymentDTO,
            BindingResult result, Model model, final RedirectAttributes redirectAttributes) {

        logger.debug("saveOrUpdateContract() : {}", paymentDTO);

        if (result.hasErrors()) {
            return "userpayroll.payrollpayments.showEdit.def";
        } else {

            redirectAttributes.addFlashAttribute("css", "success");
            if (paymentDTO.getIdPayment() == null) {
                redirectAttributes.addFlashAttribute("msg", "Contract added successfully!");
            } else {
                redirectAttributes.addFlashAttribute("msg", "Contract updated successfully!");
            }

            Payment payment = paymentConvertor.convert(paymentDTO);
            paymentService.saveOrUpdate(payment);

            return "redirect:/userpayroll/payrollpayments/list";

        }
    }
    
     /**
     *
     * Add Contract
     */

    @RequestMapping(value = "/showAddNewPayment", method = RequestMethod.GET)
    String showAddNewPayment(Model model) {

        PaymentDTO paymentDTO = new PaymentDTO();
        model.addAttribute("paymentDTO", paymentDTO);

        return "userpayroll.payrollpayments.showEdit.def";

    }


  
    
    
     @RequestMapping(value = "/showEdit/{idPayment}", method = RequestMethod.GET)
    String showEdit(@PathVariable("idPayment") int idPayment, Model model) {
        Payment payment = paymentService.findById(idPayment);
        if (payment == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Contract not found");

        } else {
            PaymentDTO paymentDTO = paymentConvertor.convert(payment);
            model.addAttribute("paymentDTO", paymentDTO);

        }

        return "userpayroll.payrollpayments.showEdit.def";
    }

    
    /**
     *
     * Delete Contract
     *
     */
    @RequestMapping(value = "/delete/{idPayment}", method = RequestMethod.GET)
    public String deletePayment(@PathVariable("idPayment") int idPayment, final RedirectAttributes redirectAttributes) {

        logger.debug("deletePayment() : {}", idPayment);
        //    System.out.println("deleteContract() : {}" + idContract);

        paymentService.delete(idPayment);

        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "Contract is deleted!");

        return "redirect:/userpayroll/payrollpayments/list";

    }
    
    
     @InitBinder
     public void initBinderDate(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormatP = new SimpleDateFormat("yyyy-MM-dd");
        dateFormatP.setLenient(false);
        binder.registerCustomEditor(Date.class,null, new CustomDateEditor( dateFormatP, true));
    }
     

}

