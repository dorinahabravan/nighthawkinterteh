package com.iucosoft.nighthawk_interteh_service.serviciispring.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.entities.Subcontractor;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWUserServiceIntf;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.SubcontractorServiceIntf;
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
public class SubcontractorServiceImplIntegrationTest extends IntegrationTestBase {

    @Autowired
     private Subcontractor subcontractor;

    @Autowired
    private SubcontractorServiceIntf subcontractorService;

    
     @Autowired
    private NWUser nWUser;

    @Autowired
    private NWUserServiceIntf nwuserService;
    
    
    @Before
    public void before() {
        Integer id = this.nwuserService.save(this.nWUser);
        Assert.assertNotNull(id);
        subcontractor.setUser(nWUser);
        
        this.subcontractorService.save(this.subcontractor);


    }

    @After
    public void tearDown() {

        this.subcontractorService.delete(subcontractor.getIdSubcontractor());
            this.nwuserService.delete(nWUser.getIdUser());
    }

    @Test
    public void get() {
        Subcontractor subcontractorDB = this.subcontractorService.findById(this.subcontractor.getIdSubcontractor());
        Assert.assertEquals(this.subcontractor, subcontractorDB);
    }

}
