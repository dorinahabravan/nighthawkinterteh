package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.userpayroll;

import com.iucosoft.nighthawk_interteh_service.entities.Contract;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.ContractServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.dto.ContractDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.ContractConvertor;
import com.iucosoft.nighthawk_interteh_web_cms.dto.validator.ContractsFormValidator;
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
@RequestMapping("/userpayroll/payrollcontracts")
public class PayrollContractsController {
    
    
    
     private final Logger logger = LoggerFactory.getLogger(PayrollContractsController.class);

    @Autowired
    ContractServiceIntf contractService;

    @Autowired
    ContractConvertor contractConvertor;
    
    @Autowired
    ContractsFormValidator contractsFormValidator;
    
    @InitBinder
     protected void initBinder(WebDataBinder binder) {
        binder.setValidator((Validator) contractsFormValidator);
    }
    
    
     

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ModelAndView list() {

        ModelAndView mv = new ModelAndView("userpayroll.payrollcontracts.list.def");
        try {
           List<Contract> lista = contractService.list();
            List<ContractDTO> contractDTOList = contractConvertor.convert(lista);
            mv.addObject("contractDTOList", contractDTOList);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return mv;
    }


    
    
    
    
    @RequestMapping(value = "/showView/{idContract}", method = RequestMethod.GET)
    String showView(@PathVariable("idContract") int idContract, Model model) {

        logger.debug("showView() idContract: {}", idContract);

        Contract contract = contractService.findById(idContract);
        if (contract == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Contract not found");

        } else {

            ContractDTO contractDTO = contractConvertor.convert(contract);
            model.addAttribute("contractDTO", contractDTO);

        }

        return  "userpayroll.payrollcontracts.showView.def";
    }
    
     /**
     * Save or Update Contract *
     *
     *
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)

    public String saveOrUpdateContract(@ModelAttribute("contractDTO") @Validated ContractDTO contractDTO,
            BindingResult result, Model model, final RedirectAttributes redirectAttributes) {

        logger.debug("saveOrUpdateContract() : {}", contractDTO);

        if (result.hasErrors()) {
            return "userpayroll.payrollcontracts.showEdit.def";
        } else {

            redirectAttributes.addFlashAttribute("css", "success");
            if (contractDTO.getIdContract() == null) {
                redirectAttributes.addFlashAttribute("msg", "Contract added successfully!");
            } else {
                redirectAttributes.addFlashAttribute("msg", "Contract updated successfully!");
            }

            Contract contract = contractConvertor.convert(contractDTO);
            contractService.saveOrUpdate(contract);

            return "redirect:/userpayroll/payrollcontracts/list";

        }
    }

    /**
     *
     * Add Contract
     */

    @RequestMapping(value = "/showAddNewContract", method = RequestMethod.GET)
    String showAddNewContract(Model model) {

        ContractDTO contractDTO = new ContractDTO();
        model.addAttribute("contractDTO", contractDTO);

        return "userpayroll.payrollcontracts.showEdit.def";

    }

    
     @RequestMapping(value = "/showEdit/{idContract}", method = RequestMethod.GET)
    String showEdit(@PathVariable("idContract") int idContract, Model model) {
        Contract contract = contractService.findById(idContract);
        if (contract == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Contract not found");

        } else {
            ContractDTO contractDTO = contractConvertor.convert(contract);
            model.addAttribute("contractDTO", contractDTO);

        }

        return "userpayroll.payrollcontracts.showEdit.def";
    }

    /**
     *
     * Delete Contract
     *
     */
    @RequestMapping(value = "/delete/{idContract}", method = RequestMethod.GET)
    public String deleteContract(@PathVariable("idContract") int idContract, final RedirectAttributes redirectAttributes) {

        logger.debug("deleteContract() : {}", idContract);
        //    System.out.println("deleteContract() : {}" + idContract);

        contractService.delete(idContract);

        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "Contract is deleted!");

        return "redirect:/userpayroll/payrollcontracts/list";

    }
   

   
}
    