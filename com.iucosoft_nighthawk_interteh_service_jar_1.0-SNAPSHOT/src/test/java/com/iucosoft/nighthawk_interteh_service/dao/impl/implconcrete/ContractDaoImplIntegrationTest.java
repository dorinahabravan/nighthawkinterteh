
package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.ContractDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.EmployercompanyDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.NighthawkintertehDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Contract;
import com.iucosoft.nighthawk_interteh_service.entities.Employercompany;
import com.iucosoft.nighthawk_interteh_service.entities.Nighthawkinterteh;

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
public class ContractDaoImplIntegrationTest extends IntegrationTestBase {

    @Autowired
    private Contract contract;

    @Autowired
    ContractDaoIntf contractDao;
    
      @Autowired
    private Nighthawkinterteh nighthawkinterteh;

    @Autowired
    private NighthawkintertehDaoIntf nighthawkintertehDao;

       @Autowired
    private Employercompany employercompany;
    @Autowired
    private EmployercompanyDaoIntf employercompanyDao;

    @Before
    public void setUp() {
        
        
            Integer idCompany = this.employercompanyDao.save(this.employercompany);
        Assert.assertNotNull(idCompany);
        contract.setEmployercompany(employercompany);
        
         Integer id = this.nighthawkintertehDao.save(this.nighthawkinterteh);
        Assert.assertNotNull(id);
        contract.setNighthawkinterteh(nighthawkinterteh);
        this.contractDao.save(this.contract);
    }

    @After
    public void tearDown() {
        
        
        this.contractDao.delete(contract.getIdContract());
            this.nighthawkintertehDao.delete(nighthawkinterteh.getIdCompany());
            this.employercompanyDao.delete(employercompany.getIdClientCompany());
    }

    @Test
    public void testSomeMethod() {
        Contract contractDB = this.contractDao.findById(this.contract.getIdContract());
        Assert.assertEquals(this.contract,contractDB);

    }

}
