
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.GenericDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.NWRoleDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.NWRole;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWRoleServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.impl.GenericServiceAbstractImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 *
 * @author 
 */
@Service("nwroleService")
public class NWRoleServiceImpl 
        extends GenericServiceAbstractImpl<NWRole, Integer> 
                 implements NWRoleServiceIntf{
    
    
    
    @Autowired
    NWRoleDaoIntf roleDao;

    @Autowired
    public NWRoleServiceImpl(@Qualifier("nwroleDao") GenericDaoIntf genericDao) {
        super(genericDao);
        this.roleDao = (NWRoleDaoIntf) genericDao;
    }
    
   
}
