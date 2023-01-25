package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.CompanysubcontractorDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Companysubcontractor;
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
public class CompanysubcontractorDaoImplIntegrationTest extends IntegrationTestBase {

    @Autowired
    private Companysubcontractor companysubcontractor;

    @Autowired
    private CompanysubcontractorDaoIntf companySubcontractorDao;

    @Before
    public void setUp() {
        
        this.companySubcontractorDao.save(this.companysubcontractor);
    }

    @After
    public void tearDown() {
        
        this.companySubcontractorDao.delete(companysubcontractor.getId());
    }

    @Test
    public void testSomeMethod() {
      
        Companysubcontractor companysubcontractorDB = this.companySubcontractorDao.findById(this.companysubcontractor.getId());
        Assert.assertEquals(this.companysubcontractor ,companysubcontractorDB);
    }

}
