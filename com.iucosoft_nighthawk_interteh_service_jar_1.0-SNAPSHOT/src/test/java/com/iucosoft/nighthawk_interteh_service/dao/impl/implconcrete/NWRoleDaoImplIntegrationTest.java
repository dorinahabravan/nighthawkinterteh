package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.NWRoleDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.NWRole;
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
public class NWRoleDaoImplIntegrationTest extends IntegrationTestBase {

    @Autowired
    private NWRole nWRole;

    @Autowired
    private NWRoleDaoIntf nwroleDao;

    @Before
    public void setUp() {
        this.nwroleDao.save(this.nWRole);
    }

    @After
    public void tearDown() {
        this.nwroleDao.delete(nWRole.getUserRoleId());
    }

    @Test
    public void testSomeMethod() {
        NWRole nWRoleDB = this.nwroleDao.findById(this.nWRole.getUserRoleId());
        Assert.assertEquals(this.nWRole, nWRoleDB);

    }

}
