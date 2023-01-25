package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.usersubcontractor;

import com.iucosoft.nighthawk_interteh_service.entities.Subcontractor;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWUserServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.SubcontractorServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.dto.SubcontractorDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.NWUserConvertor;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.SubcontractorConvertor;
import com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.admin.PersonalDetailsController;
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
@RequestMapping("/usersubcontractor/subcontrpersonaldetails")
public class SubcontractorPersonalDetailsController {

    private final Logger logger = LoggerFactory.getLogger(PersonalDetailsController.class);

    @Autowired
    SubcontractorServiceIntf subcontractorService;

    @Autowired
    NWUserServiceIntf nwuserService;

    @Autowired
    SubcontractorConvertor subcontractorConvertor;

    @Autowired
    NWUserConvertor nWUserConvertor;

    
     /**
     * Show PersonalDetails
     *
     */
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ModelAndView list() {

        ModelAndView mv = new ModelAndView("usersubcontractor.subcontrpersonaldetails.list.def");
        try {
            List<Subcontractor> lista = subcontractorService.list();
            List<SubcontractorDTO> subcontractorDTOList = subcontractorConvertor.convert(lista);
            mv.addObject("subcontractorDTOList", subcontractorDTOList);
        } catch (Exception e) {
            e.printStackTrace();


        }
        return mv;
    }

    
     /**
     * Show PersonalDetails
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
        
        
        return "usersubcontractor.subcontrpersonaldetails.showView.def";
    }

    
    
    
    
     /**
     * Save or Update Personal Details *
     *
     *
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String saveOrUpdate(@ModelAttribute("subcontractorDTO") SubcontractorDTO subcontractorDTO, BindingResult result,
            Model model, final RedirectAttributes redirectAttributes) {

        
        
         logger.debug("saveOrUpdate() : {}", subcontractorDTO);

        if (result.hasErrors()) {
            return "usersubcontractor.subcontrpersonaldetails.showEdit.def";

        } else {

            redirectAttributes.addFlashAttribute("css", "success");
            if (subcontractorDTO.getIdSubcontractor() == null) {
                redirectAttributes.addFlashAttribute("msg", "Subcontractor added successfully!");

            } else {
                redirectAttributes.addFlashAttribute("msg", "Subcontractor updated successfully!");
            }

            Subcontractor subcontractor = subcontractorConvertor.convert(subcontractorDTO);
            subcontractorService.saveOrUpdate(subcontractor);

        }
        
        
    return "redirect:/usersubcontractor/subcontrpersonaldetails/list";
    }
    
    
    
    
     @RequestMapping(value = "/showAddNewSubcontractor", method = RequestMethod.GET)
    String showAddNewSubcontractor(Model model) {

        SubcontractorDTO subcontractorDTO = new SubcontractorDTO();
        model.addAttribute("subcontractorDTO", subcontractorDTO);

        return "usersubcontractor.subcontrpersonaldetails.showEdit.def";
    }
   
    
    
    
    
    

    //Modifies an role
    @RequestMapping(value = "/showEdit/{idSubcontractor}", method = RequestMethod.GET)
    String showEdit(@PathVariable("idSubcontractor") int idSubcontractor, Model model) {
        
        
        
        Subcontractor  subcontractor = subcontractorService.findById(idSubcontractor);
        if (subcontractor == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Subcontractor not found");

        } else {
            SubcontractorDTO subcontractorDTO = subcontractorConvertor.convert(subcontractor);
            model.addAttribute("subcontractorDTO", subcontractorDTO);
        }
        
        

        return "usersubcontractor.subcontrpersonaldetails.showEdit.def";
        
              

        
    }
    
     @RequestMapping(value = "/delete/{idSubcontractor}", method = RequestMethod.GET)
    public String deleteSubcontractor(@PathVariable("idSubcontractor") int idSubcontractor,
            final RedirectAttributes redirectAttributes) {

        logger.debug("delete() : {}", idSubcontractor);

        subcontractorService.delete(idSubcontractor);

        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "Subcontractor  is deleted!");

        return "redirect:/usersubcontractor/subcontrpersonaldetails/list";

    }
    
    
      @InitBinder
     public void initBinderDate(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormatP = new SimpleDateFormat("yyyy-MM-dd");
        dateFormatP.setLenient(false);
        binder.registerCustomEditor(Date.class,null, new CustomDateEditor( dateFormatP, true));
    }
    
    
}
