package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.NWUserDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.PayrollDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.entities.Payroll;
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
public class PayrollDaoImplIntegrationTest extends IntegrationTestBase {

    @Autowired
    private Payroll payroll;

    @Autowired
    private PayrollDaoIntf payrollDao;
    
     @Autowired
    private NWUser nWUser;

    @Autowired
    private NWUserDaoIntf nwuserDao;


    @Before
    public void setUp() {
        
         Integer id = this.nwuserDao.save(this.nWUser);
        Assert.assertNotNull(id);
        payroll.setUser(nWUser);

        this.payrollDao.save(this.payroll);
    }

    @After
    public void tearDown() {

        this.payrollDao.delete(payroll.getIdPayroll());
        
              this.nwuserDao.delete(nWUser.getIdUser());
    }

    @Test
    public void testSomeMethod() {

        Payroll payrollDB = this.payrollDao.findById(this.payroll.getIdPayroll());
        Assert.assertEquals( this.payroll ,payrollDB);

    }

}
