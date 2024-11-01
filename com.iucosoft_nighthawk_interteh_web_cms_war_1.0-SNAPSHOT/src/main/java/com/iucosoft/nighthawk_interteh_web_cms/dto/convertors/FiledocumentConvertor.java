package com.iucosoft.nighthawk_interteh_web_cms.dto.convertors;

import com.iucosoft.nighthawk_interteh_service.entities.Filedocument;
import com.iucosoft.nighthawk_interteh_web_cms.dto.FiledocumentDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dorina
 */
@Component
public class FiledocumentConvertor {
    
    public Filedocument convert(FiledocumentDTO filedocumentDTO) {
        
        Filedocument filedocument = new Filedocument();

        
    filedocument.setFileDocumentId(filedocumentDTO.getFileDocumentId());
        filedocument.setAccount(filedocumentDTO.getAccount());
        filedocument.setFileName(filedocumentDTO.getFileName());
        filedocument.setFileExtenstion(filedocumentDTO.getFileExtenstion());
        filedocument.setDocumentContent(filedocumentDTO.getDocumentContent());
//        filedocument.setFilecontents(filedocumentDTO.getFilecontents());
       
      

        
        return filedocument;
    }
    
    public FiledocumentDTO convert(Filedocument filedocument ) {
        FiledocumentDTO filedocumentDTO = new FiledocumentDTO();
   
        
       filedocumentDTO.setFileDocumentId(filedocument.getFileDocumentId());
        filedocumentDTO.setAccount(filedocument.getAccount());
        filedocumentDTO.setFileName(filedocument.getFileName());
        filedocumentDTO.setFileExtenstion(filedocument.getFileExtenstion());
        filedocumentDTO.setDocumentContent(filedocument.getDocumentContent());
//                filedocumentDTO.setFilecontents(filedocument.getFilecontents());

       
        
        return filedocumentDTO;
    }
    
    
      public List<FiledocumentDTO> convert(List<Filedocument> filedocumentList) {
        List<FiledocumentDTO> filedocumentDTOList = new ArrayList<FiledocumentDTO>();

        for (Filedocument filedocument : filedocumentList) {
            FiledocumentDTO filedocumentDTO = convert(filedocument);
            filedocumentDTOList.add(filedocumentDTO);

        }

        return filedocumentDTOList;

    }


//    public List<PortofolioDTO> convert(List<Portofolio> portofolioList) {
//        List<PortofolioDTO> portofolioDTOList = new ArrayList<PortofolioDTO>();
//        for (Portofolio portofolio : portofolioList) {
//            PortofolioDTO portofolioDTO = convert(portofolio);
//            portofolioDTOList.add(portofolioDTO);
//
//        }
//
//        return portofolioDTOList;
//    }
}
