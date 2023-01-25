package com.iucosoft.nighthawk_interteh_web_cms.dto.convertors;

import com.iucosoft.nighthawk_interteh_service.entities.Administrator;
import com.iucosoft.nighthawk_interteh_web_cms.dto.AdministratorDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dorina
 */
@Component
public class AdministratorConvertor {

    public Administrator convert(AdministratorDTO administratorDTO) {

        Administrator administrator = new Administrator();

        administrator.setIdAdministrator(administratorDTO.getIdAdministrator());
        administrator.setUser(administratorDTO.getUser());
        administrator.setAdministratorName(administratorDTO.getAdministratorName());
        administrator.setAdministratorEmail(administratorDTO.getAdministratorEmail());
        return administrator;

    }

    public AdministratorDTO convert(Administrator administrator) {
        AdministratorDTO administratorDTO = new AdministratorDTO();

        administratorDTO.setIdAdministrator(administrator.getIdAdministrator());
        administratorDTO.setUser(administrator.getUser());
        administratorDTO.setAdministratorName(administrator.getAdministratorName());
        administratorDTO.setAdministratorEmail(administrator.getAdministratorEmail());

        return administratorDTO;

    }

    public List<AdministratorDTO> convert(List<Administrator> administratorList) {
        List<AdministratorDTO> administratorDTOList = new ArrayList<AdministratorDTO>();

        for (Administrator administrator : administratorList) {
            AdministratorDTO administratorDTO = convert(administrator);
            administratorDTOList.add(administratorDTO);

        }

        return administratorDTOList;

    }

}
