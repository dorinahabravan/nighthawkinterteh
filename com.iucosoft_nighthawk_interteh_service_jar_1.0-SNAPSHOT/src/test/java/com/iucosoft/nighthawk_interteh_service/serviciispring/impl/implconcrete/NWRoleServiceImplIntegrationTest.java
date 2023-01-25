
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.entities.NWRole;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWRoleServiceIntf;
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
public class NWRoleServiceImplIntegrationTest extends IntegrationTestBase{
    
   @Autowired
    private NWRole nWRole;

    @Autowired
    private NWRoleServiceIntf nwroleService;
    
  
    
    @Before
    public void setUp() {
         this.nwroleService.save(this.nWRole);
        
    }
    
    @After
    public void tearDown() {
                this.nwroleService.delete(nWRole.getUserRoleId());

    }
    

    @Test
    public void testSomeMethod() {
       NWRole nWRoleDB = this.nwroleService.findById(this.nWRole.getUserRoleId());
        Assert.assertEquals(this.nWRole, nWRoleDB);

    }
    
}
