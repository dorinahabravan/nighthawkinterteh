package com.iucosoft.nighthawk_interteh_web_cms.dto.convertors;

import com.iucosoft.nighthawk_interteh_service.entities.Employercompany;
import com.iucosoft.nighthawk_interteh_web_cms.dto.EmployercompanyDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dorina
 */
@Component
public class EmployercompanyConvertor {

    public Employercompany convert(EmployercompanyDTO employercompanyDTO) {

        Employercompany employercompany = new Employercompany();

        employercompany.setIdClientCompany(employercompanyDTO.getIdClientCompany());
        employercompany.setClientCompanyName(employercompanyDTO.getClientCompanyName());
        employercompany.setClientCompanyAddress(employercompanyDTO.getClientCompanyAddress());
        employercompany.setClientCompanyType(employercompanyDTO.getClientCompanyType());
        employercompany.setClientCompanyDescription(employercompanyDTO.getClientCompanyDescription());
        employercompany.setContracts(employercompanyDTO.getContracts());
        return employercompany;

    }

    public EmployercompanyDTO convert(Employercompany employercompany) {
        EmployercompanyDTO employercompanyDTO = new EmployercompanyDTO();

        employercompanyDTO.setIdClientCompany(employercompany.getIdClientCompany());
        employercompanyDTO.setClientCompanyName(employercompany.getClientCompanyName());
        employercompanyDTO.setClientCompanyAddress(employercompany.getClientCompanyAddress());
        employercompanyDTO.setClientCompanyType(employercompany.getClientCompanyType());
        employercompanyDTO.setClientCompanyDescription(employercompany.getClientCompanyDescription());
        employercompanyDTO.setContracts(employercompany.getContracts());

        return employercompanyDTO;

    }

    public List<EmployercompanyDTO> convert(List<Employercompany> employercompanyList) {
        List<EmployercompanyDTO> employercompanyDTOList = new ArrayList<EmployercompanyDTO>();

        for (Employercompany employercompany : employercompanyList) {
            EmployercompanyDTO employercompanyDTO = convert(employercompany);
            employercompanyDTOList.add(employercompanyDTO);

        }

        return employercompanyDTOList;

    }

}
