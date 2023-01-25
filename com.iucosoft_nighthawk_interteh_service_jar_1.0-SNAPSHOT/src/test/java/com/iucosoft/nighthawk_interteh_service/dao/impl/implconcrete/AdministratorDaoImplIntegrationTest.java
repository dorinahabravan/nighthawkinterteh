package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.AdministratorDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.NWUserDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Administrator;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;

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
public class AdministratorDaoImplIntegrationTest extends IntegrationTestBase {

    @Autowired
    private Administrator administrator;

    @Autowired
    private AdministratorDaoIntf administratorDao;

    @Autowired
    private NWUser nWUser;

    @Autowired
    private NWUserDaoIntf nwuserDao;

    @Before
    public void setUp() {

        Integer id = this.nwuserDao.save(this.nWUser);
        Assert.assertNotNull(id);
        administrator.setUser(nWUser);
        this.administratorDao.save(this.administrator);
    }

    @After
    public void tearDown() {
        this.administratorDao.delete(administrator.getIdAdministrator());

        this.nwuserDao.delete(nWUser.getIdUser());
    }

    @Test
    public void testSomeMethod() {
        Administrator administratorDB = this.administratorDao.findById(this.administrator.getIdAdministrator());
        Assert.assertEquals(this.administrator, administratorDB);
        String name = "Dorina";
        administratorDB.setAdministratorName(name);
        administratorDao.update(administratorDB);
        String updatedName =  this.administratorDao.findById(this.administrator.getIdAdministrator()).getAdministratorName();
        Assert.assertEquals(name, updatedName);
    }

}
