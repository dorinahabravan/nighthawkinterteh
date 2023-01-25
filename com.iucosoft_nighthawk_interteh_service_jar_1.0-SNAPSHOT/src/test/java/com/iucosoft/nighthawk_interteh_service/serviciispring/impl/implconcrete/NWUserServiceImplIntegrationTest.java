
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.entities.NWRole;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWRoleServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWUserServiceIntf;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Dorina
 */
@Slf4j
public class NWUserServiceImplIntegrationTest extends IntegrationTestBase{
    
       @Autowired
    private NWUser nWUser;

    @Autowired
    private NWUserServiceIntf nwuserService;
    
    
      @Autowired
    private NWRole nWRole;

    @Autowired
    private NWRoleServiceIntf nwroleService;
  
    
    @Before
    public void setUp() {
        
          Integer idRole = this.nwroleService.save(this.nWRole);
                Assert.assertNotNull(idRole);
                nWUser.setRole(nWRole);
          Integer id = this.nwuserService.save(this.nWUser);
        Assert.assertNotNull(id);
        
        
    }
    
    @After
    public void tearDown() {
        
                this.nwuserService.delete(nWUser.getIdUser());
                
                this.nwroleService.delete(nWRole.getUserRoleId());

    }

    @Test
    public void testSomeMethod() {
        NWUser nWUserDB = this.nwuserService.findById(this.nWUser.getIdUser());
        Assert.assertEquals(this.nWUser, nWUserDB);
    }
    
}
