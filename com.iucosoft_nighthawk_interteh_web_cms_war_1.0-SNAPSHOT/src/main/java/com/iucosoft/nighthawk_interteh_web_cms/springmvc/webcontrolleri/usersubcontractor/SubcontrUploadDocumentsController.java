

package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.usersubcontractor;

import com.iucosoft.nighthawk_interteh_service.entities.Filedocument;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.FiledocumentServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.dto.FiledocumentDTO;
import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.FiledocumentConvertor;
//import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.FiledocumentConvertor;
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
 *
 * @author Dorina
 */
@Controller
@RequestMapping("/usersubcontractor/subcontruploaddocuments")
public class SubcontrUploadDocumentsController {
    
    
     private final Logger logger = LoggerFactory.getLogger(SubcontrUploadDocumentsController.class);

    @Autowired
    FiledocumentServiceIntf fileDocumentService;

    @Autowired
    FiledocumentConvertor filedocumentConvertor;
    
//    @Autowired
//    ContractsFormValidator contractsFormValidator;
//    
//    @InitBinder
//     protected void initBinder(WebDataBinder binder) {
//        binder.setValidator((Validator) contractsFormValidator);
//    }
    

 

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    ModelAndView list() {

        ModelAndView mv = new ModelAndView("usersubcontractor.subcontruploaddocuments.list.def");
        try {
           List<Filedocument> lista = fileDocumentService.list();

            List<FiledocumentDTO> filedocumentDTOList = filedocumentConvertor.convert(lista);

            mv.addObject("filedocumentDTOList", filedocumentDTOList);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return mv;
    }
    
    
      /**
     * Show an Portofolio
     */
    @RequestMapping(value = "/showView/{fileDocumentId}", method = RequestMethod.GET)
    String showView(@PathVariable("fileDocumentId") int documentId, Model model) {
        logger.debug("showView() documentId: {}", documentId);

        Filedocument filedocument = fileDocumentService.findById(documentId);
        if (filedocument == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Document not found");

        } else {
            FiledocumentDTO filedocumentDTO = filedocumentConvertor.convert(filedocument);

            model.addAttribute("filedocument", filedocumentDTO);

        }

        return "usersubcontractor.subcontruploaddocuments.showView.def";
    }
    
    
     
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public String saveOrUpdateDocument(@ModelAttribute("filedocumentDTO") FiledocumentDTO filedocumentDTO,
            BindingResult result, Model model, final RedirectAttributes redirectAttributes) {

        logger.debug("saveOrUpdateDocument() : {}", filedocumentDTO);

        if (result.hasErrors()) {
            return "usersubcontractor.subcontruploaddocuments.showEdit.def";
        } else {

            redirectAttributes.addFlashAttribute("css", "success");
            if (filedocumentDTO.getFileDocumentId() == null) {
                redirectAttributes.addFlashAttribute("msg", "Document  added successfully!");
            } else {
                redirectAttributes.addFlashAttribute("msg", "Document updated successfully!");
            }

            Filedocument filedocument = filedocumentConvertor.convert(filedocumentDTO);
            fileDocumentService.saveOrUpdate(filedocument);

            return "redirect:/usersubcontractor/subcontruploaddocuments/list";
        }

}
    
    
     @RequestMapping(value = "/showAddNewDocument", method = RequestMethod.GET)
    String showAddNewDocument(Model model) {

      FiledocumentDTO filedocumentDTO = new FiledocumentDTO();
        model.addAttribute("filedocumentDTO", filedocumentDTO);

        return "usersubcontractor.subcontruploaddocuments.showEdit.def";
    }
    
    
    /**
     * showEdit Buton cu numele Update in sens de arata pentru a fi editat
     */
    @RequestMapping(value = "/showEdit/{fileDocumentId}", method = RequestMethod.GET)
    String showEdit(@PathVariable("fileDocumentId") int fileDocumentId, Model model) {
        Filedocument filedocument = fileDocumentService.findById(fileDocumentId);
        if (filedocument == null) {
            model.addAttribute("css", "danger");
            model.addAttribute("msg", "Document not found");

        } else {
            FiledocumentDTO filedocumentDTO = filedocumentConvertor.convert(filedocument);
            model.addAttribute("filedocumentDTO", filedocumentDTO);

        }

        return "usersubcontractor.subcontruploaddocuments.showEdit.def";
    }
    
     /**
     *
     * Delete Portofolio
     *
     */
    @RequestMapping(value = "/delete/{fileDocumentId}", method = RequestMethod.GET)
    public String delete(@PathVariable("fileDocumentId") int fileDocumentId, final RedirectAttributes redirectAttributes) {

        logger.debug("delete() : {}", fileDocumentId);

        fileDocumentService.delete(fileDocumentId);

        redirectAttributes.addFlashAttribute("css", "success");
        redirectAttributes.addFlashAttribute("msg", "Document is deleted!");

        return "redirect:/usersubcontractor/subcontruploaddocuments/list";

    }
   
}
