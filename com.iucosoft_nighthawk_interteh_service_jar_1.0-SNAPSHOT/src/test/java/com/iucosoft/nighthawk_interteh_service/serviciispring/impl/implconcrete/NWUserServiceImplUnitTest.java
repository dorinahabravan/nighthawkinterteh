
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.UnitTestBase;
import com.iucosoft.nighthawk_interteh_service.entities.NWRole;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWRoleServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWUserServiceIntf;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Dorina
 */
@Slf4j
public class NWUserServiceImplUnitTest extends UnitTestBase {
    
    
     @Autowired
    private NWUser nWUser;

    @Autowired
    private NWUserServiceIntf nwuserService;
    
      @Autowired
    private NWRole nWRole;

    @Autowired
    private NWRoleServiceIntf nwroleService;
    
    
    
      @Before
    public void before()
    {
        
        
        
          Integer idRole = this.nwroleService.save(this.nWRole);
                Assert.assertNotNull(idRole);
                nWUser.setRole(nWRole);
        
        
        this.nwuserService.save(this.nWUser);
    }
    
      @Test
    public void update()
    {
        this.nwuserService.update(nWUser);
        
        this.nwroleService.update(nWRole);
    }
}

