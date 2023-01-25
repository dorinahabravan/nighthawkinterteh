package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.NWRoleDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.NWUserDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.NWRole;
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
public class NWUserDaoImplIntegrationTest extends IntegrationTestBase {

    @Autowired
    private NWUser nWUser;

    @Autowired
    private NWUserDaoIntf nwuserDao;
    
     @Autowired
    private NWRole nWRole;

    @Autowired
    private NWRoleDaoIntf nwroleDao;


    @Before
    public void setUp() {

        Integer idRole = this.nwroleDao.save(nWRole);
                Assert.assertNotNull(idRole);
                nWUser.setRole(nWRole);

//        Integer id = this.nwuserDao.save(this.nWUser);
//        Assert.assertNotNull(id);
        this.nwuserDao.save(this.nWUser);
        
    }

    @After
    public void tearDown() {
        this.nwuserDao.delete(nWUser.getIdUser());
        
        this.nwroleDao.delete(nWRole.getUserRoleId());
    }

    @Test
    public void testSomeMethod() {

        NWUser nWUserDB = this.nwuserDao.findById(this.nWUser.getIdUser());
        Assert.assertEquals(this.nWUser, nWUserDB);
    }

}
