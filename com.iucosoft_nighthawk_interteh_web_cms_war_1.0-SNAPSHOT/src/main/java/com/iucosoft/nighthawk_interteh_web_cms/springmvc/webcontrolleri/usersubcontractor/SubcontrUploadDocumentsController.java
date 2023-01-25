

package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.usersubcontractor;

import com.iucosoft.nighthawk_interteh_service.entities.Filedocument;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.FiledocumentServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.dto.FiledocumentDTO;
//import com.iucosoft.nighthawk_interteh_web_cms.dto.convertors.FiledocumentConvertor;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

//    @Autowired
//    FiledocumentConvertor filedocumentConvertor;
//    
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
//            List<FiledocumentDTO> filedocumentDTOList = filedocumentConvertor.convert(lista);
//            mv.addObject("filedocumentDTOList", filedocumentDTOList);

        } catch (Exception e) {
            e.printStackTrace();

        }
        return mv;
    }
    }

//    @RequestMapping(value = "/showView", method = RequestMethod.GET)
//    String showView() {
//
//        return "usersubcontractor.subcontruploaddocuments.showView.def";
//    }
//
//    @RequestMapping(value = "/showEdit", method = RequestMethod.GET)
//    String showEdit() {
//
//        return "usersubcontractor.subcontruploaddocuments.showEdit.def";
//    }
//
//    //Modifies an role
//    @RequestMapping(value = "/edit", method = RequestMethod.GET)
//    String edit() {
//
//        return "usersubcontractor.subcontruploaddocuments.edit.def";
//    }
