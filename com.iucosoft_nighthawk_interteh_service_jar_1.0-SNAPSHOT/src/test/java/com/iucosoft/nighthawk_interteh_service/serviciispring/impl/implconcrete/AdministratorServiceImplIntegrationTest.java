
package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.entities.Administrator;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.AdministratorServiceIntf;
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
public class AdministratorServiceImplIntegrationTest extends  IntegrationTestBase{
    
    @Autowired
    private Administrator administrator;

    @Autowired
    private AdministratorServiceIntf administratorService;

    @Autowired
    private NWUser nWUser;

    @Autowired
    private NWUserServiceIntf nwuserService;
    
    
    
    @Before
    public void setUp() {
        
        Integer id= this.nwuserService.save(this.nWUser);
        Assert.assertNotNull(id);
        administrator.setUser(nWUser);
        
        this.administratorService.save(this.administrator);
        
    }
    
    @After
    public void tearDown() {
                this.administratorService.delete(administrator.getIdAdministrator());
                this.nwuserService.delete(nWUser.getIdUser());

        
        
    }

    @Test
    public void testSomeMethod() {
        Administrator administratorDB = this.administratorService.findById(this.administrator.getIdAdministrator());
        Assert.assertEquals(this.administrator, administratorDB);
        String name = "Bogdan7036";
        administratorDB.setAdministratorName(name);
        administratorService.update(administratorDB);
        String updatedName =  this.administratorService.findById(this.administrator.getIdAdministrator()).getAdministratorName();
        Assert.assertEquals(name, updatedName);
    }
    
}
