package com.iucosoft.nighthawk_interteh_web_cms.dto.convertors;

import com.iucosoft.nighthawk_interteh_service.entities.NWRole;
import com.iucosoft.nighthawk_interteh_web_cms.dto.NWRoleDTO;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 *
 * @author Dorina
 */
@Component
public class NWRoleConvertor {

    public NWRole convert(NWRoleDTO nwRoleDTO) {
        NWRole nwRole = new NWRole();
        nwRole.setUserRoleName(nwRoleDTO.getUserRoleName());
        nwRole.setUserRoleId(nwRoleDTO.getUserRoleId());
        nwRole.setEnabled(nwRoleDTO.isEnabled());

        return nwRole;
    }

    public NWRoleDTO convert(NWRole nwRole) {
        NWRoleDTO nwRoleDTO = new NWRoleDTO();
        nwRoleDTO.setUserRoleName(nwRole.getUserRoleName());
        nwRoleDTO.setUserRoleId(nwRole.getUserRoleId());
        nwRoleDTO.setEnabled(nwRole.isEnabled());

        return nwRoleDTO;
    }

    public List<NWRoleDTO> convert(List<NWRole> nwRoleList) {
        List<NWRoleDTO> nwRoleDTOList = new ArrayList<NWRoleDTO>();
        for (NWRole nwRole : nwRoleList) {
            NWRoleDTO nwRoleDTO = convert(nwRole);
            nwRoleDTOList.add(nwRoleDTO);

        }

        return nwRoleDTOList;
    }
    
    
    
    

}
