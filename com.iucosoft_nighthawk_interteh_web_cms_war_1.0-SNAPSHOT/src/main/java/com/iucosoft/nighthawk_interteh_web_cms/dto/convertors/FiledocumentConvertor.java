//package com.iucosoft.nighthawk_interteh_web_cms.dto.convertors;
//
//import com.iucosoft.nighthawk_interteh_service.entities.Filecontent;
//import com.iucosoft.nighthawk_interteh_service.entities.Filedocument;
//import com.iucosoft.nighthawk_interteh_web_cms.dto.FilecontentDTO;
//import com.iucosoft.nighthawk_interteh_web_cms.dto.FiledocumentDTO;
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.stereotype.Component;
//
///**
// *
// * @author Dorina
// */
//@Component
//public class FiledocumentConvertor {
//    
//    public Filedocument convert(FiledocumentDTO filedocumentDTO , FilecontentDTO filecontentDTO) {
//        
//        Filedocument filedocument = new Filedocument();
//        Filecontent filecontent = new Filecontent();
//
//        
//       filecontent.s
//        filedocument.setAccount(filedocumentDTO.getAccount());
//        filedocument.setFileName(filedocumentDTO.getFileName());
//        filedocument.setFileExtenstion(filedocumentDTO.getFileExtenstion());
//        filedocument.setDocumentContent(filedocumentDTO.getDocumentContent());
//        filecontent.setLastUpdated(filecontentDTO.getLastUpdated());
//       
//      
//
//        
//        return filedocument;
//    }
//    
//    public FiledocumentDTO convert(Filedocument filedocument , Filecontent filecontent) {
//        FiledocumentDTO filedocumentDTO = new FiledocumentDTO();
//        FilecontentDTO filecontentDTO = new FilecontentDTO();
//        
//        filedocumentDTO.setFiledocumentId(filedocument.getDocumentId());
//        filedocumentDTO.setAccount(filedocument.getAccount());
//        filedocumentDTO.setFileName(filedocument.getFileName());
//        filedocumentDTO.setFileExtenstion(filedocument.getFileExtenstion());
//        filedocumentDTO.setDocumentContent(filedocument.getDocumentContent());
//        filecontentDTO.setLastUpdated(filecontent.getLastUpdated());
//       
//        
//        return filedocumentDTO;
//    }
//    
//    
//      public List<FiledocumentDTO> convert(List<Filedocument> filedocumentList) {
//        List<FiledocumentDTO> filedocumentDTOList = new ArrayList<FiledocumentDTO>();
//
//        for (Filedocument filedocument : filedocumentList) {
//            FiledocumentDTO filedocumentDTO = (FiledocumentDTO) convert((List<Filedocument>) filedocument);
//            filedocumentDTOList.add(filedocumentDTO);
//
//        }
//
//        return filedocumentDTOList;
//
//    }
////    public FiledocumentDTO convert(Filedocument filedocument ,  Filecontent  filecontent) {
////        PortofolioDTO portofolioDTO = new PortofolioDTO();
////
////        portofolioDTO.setDocumentId(portofolio.getDocumentId());
////        portofolioDTO.setAccount(portofolio.getAccount());
////        portofolioDTO.setFileName(portofolio.getFileName());
////        portofolioDTO.setFiileExtension(portofolio.getFiileExtension());
////        portofolioDTO.setDocumentContent(portofolio.getDocumentContent());
////
////        return portofolioDTO;
////    }
//
////    public List<PortofolioDTO> convert(List<Portofolio> portofolioList) {
////        List<PortofolioDTO> portofolioDTOList = new ArrayList<PortofolioDTO>();
////        for (Portofolio portofolio : portofolioList) {
////            PortofolioDTO portofolioDTO = convert(portofolio);
////            portofolioDTOList.add(portofolioDTO);
////
////        }
////
////        return portofolioDTOList;
////    }
//}
