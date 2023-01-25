package com.iucosoft.nighthawk_interteh_web_cms.dto.convertors;

import com.iucosoft.nighthawk_interteh_service.entities.Portofolio;
import com.iucosoft.nighthawk_interteh_web_cms.dto.PortofolioDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dorina
 */
@Component
public class PortofolioConvertor {

    public Portofolio convert(PortofolioDTO portofolioDTO) {

        Portofolio portofolio = new Portofolio();

        portofolio.setDocumentId(portofolioDTO.getDocumentId());
        portofolio.setAccount(portofolioDTO.getAccount());
        portofolio.setFileName(portofolioDTO.getFileName());
        portofolio.setFiileExtension(portofolioDTO.getFiileExtension());
        portofolio.setDocumentContent(portofolioDTO.getDocumentContent());

        return portofolio;
    }

    public PortofolioDTO convert(Portofolio portofolio) {
        PortofolioDTO portofolioDTO = new PortofolioDTO();

        portofolioDTO.setDocumentId(portofolio.getDocumentId());
        portofolioDTO.setAccount(portofolio.getAccount());
        portofolioDTO.setFileName(portofolio.getFileName());
        portofolioDTO.setFiileExtension(portofolio.getFiileExtension());
        portofolioDTO.setDocumentContent(portofolio.getDocumentContent());

        return portofolioDTO;
    }

    public List<PortofolioDTO> convert(List<Portofolio> portofolioList) {
        List<PortofolioDTO> portofolioDTOList = new ArrayList<PortofolioDTO>();
        for (Portofolio portofolio : portofolioList) {
            PortofolioDTO portofolioDTO = convert(portofolio);
            portofolioDTOList.add(portofolioDTO);

        }

        return portofolioDTOList;
    }

}
