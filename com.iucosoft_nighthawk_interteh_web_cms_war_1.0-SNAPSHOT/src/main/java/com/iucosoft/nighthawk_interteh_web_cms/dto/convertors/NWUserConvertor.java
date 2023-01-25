
package com.iucosoft.nighthawk_interteh_web_cms.dto.convertors;

import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_web_cms.dto.NWUserDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dorina
 */
@Component
public class NWUserConvertor {

    public NWUser convertor(NWUserDTO nwUserDTO) {
        NWUser nwUser = new NWUser();
        nwUser.setIdUser(nwUserDTO.getIdUser());
        nwUser.setUsername(nwUserDTO.getUsername());
        nwUser.setRole(nwUserDTO.getRole());
        nwUser.setPassword(nwUserDTO.getPassword());
        nwUser.setActive(nwUserDTO.isActive());

        return nwUser;
    }

    public NWUserDTO convertor(NWUser nwUser) {

        NWUserDTO nwUserDTO = new NWUserDTO();
        nwUserDTO.setIdUser(nwUser.getIdUser());
        nwUserDTO.setUsername(nwUser.getUsername());
        nwUserDTO.setRole(nwUser.getRole());
        nwUserDTO.setPassword(nwUser.getPassword());
        nwUserDTO.setActive(nwUser.isActive());

        return nwUserDTO;
    }
    
    
     public List<NWUserDTO> convert(List<NWUser> nwUserList) {
        List<NWUserDTO> nwUserDTOList = new ArrayList<NWUserDTO>();
        for (NWUser nwUser : nwUserList) {
            NWUserDTO nwUserDTO =convertor(nwUser);
            nwUserDTOList.add(nwUserDTO);

        }

        return nwUserDTOList;
    }

}
