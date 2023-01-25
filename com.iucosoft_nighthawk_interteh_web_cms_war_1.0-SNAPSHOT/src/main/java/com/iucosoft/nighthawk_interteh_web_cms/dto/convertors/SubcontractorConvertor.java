package com.iucosoft.nighthawk_interteh_web_cms.dto.convertors;

import com.iucosoft.nighthawk_interteh_service.entities.Subcontractor;
import com.iucosoft.nighthawk_interteh_web_cms.dto.SubcontractorDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dorina
 */
@Component

public class SubcontractorConvertor {

    public Subcontractor convert(SubcontractorDTO subcontractorDTO) {
        Subcontractor subcontractor = new Subcontractor();

        subcontractor.setIdSubcontractor(subcontractorDTO.getIdSubcontractor());
        subcontractor.setUser(subcontractorDTO.getUser());
        subcontractor.setSubcontractorName(subcontractorDTO.getSubcontractorName());
        subcontractor.setSubcontractorEmail(subcontractorDTO.getSubcontractorEmail());
        subcontractor.setSubcontractorDateOfBirth(subcontractorDTO.getSubcontractorDateOfBirth());
        subcontractor.setSubcontractorAddress(subcontractorDTO.getSubcontractorAddress());

        return subcontractor;
    }

    public SubcontractorDTO convert(Subcontractor subcontractor) {
        SubcontractorDTO subcontractorDTO = new SubcontractorDTO();

        subcontractorDTO.setIdSubcontractor(subcontractor.getIdSubcontractor());
        subcontractorDTO.setUser(subcontractor.getUser());
        subcontractorDTO.setSubcontractorName(subcontractor.getSubcontractorName());
        subcontractorDTO.setSubcontractorEmail(subcontractor.getSubcontractorEmail());
        subcontractorDTO.setSubcontractorDateOfBirth(subcontractor.getSubcontractorDateOfBirth());
        subcontractorDTO.setSubcontractorAddress(subcontractor.getSubcontractorAddress());

        return subcontractorDTO;
    }

    public List<SubcontractorDTO> convert(List<Subcontractor> subcontractorList) {
        List<SubcontractorDTO> subcontractorDTOList = new ArrayList<SubcontractorDTO>();
        for (Subcontractor subcontractor : subcontractorList) {
            SubcontractorDTO subcontractorDTO = convert(subcontractor);
            subcontractorDTOList.add(subcontractorDTO);

        }

        return subcontractorDTOList;
    }

}
