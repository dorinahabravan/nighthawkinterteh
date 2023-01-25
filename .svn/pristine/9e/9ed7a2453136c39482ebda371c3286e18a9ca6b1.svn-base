package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.EmployercompanyDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Employercompany;

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
public class EmployercompanyDaoImplIntegrationTest extends IntegrationTestBase {

    @Autowired
    private Employercompany employercompany;
    @Autowired
    private EmployercompanyDaoIntf employercompanyDao;

    @Before
    public void setUp() {

        this.employercompanyDao.save(this.employercompany);
    }

    @After
    public void tearDown() {

        this.employercompanyDao.delete(employercompany.getIdClientCompany());
    }

    @Test
    public void testSomeMethod() {

        Employercompany employercompanyDB = this.employercompanyDao.findById(this.employercompany.getIdClientCompany());
        Assert.assertEquals(employercompanyDB, this.employercompany);

    }

}
