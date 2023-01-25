package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.dao.concrete.SubcontractorDaoIntf;

import com.iucosoft.nighthawk_interteh_service.entities.Subcontractor;
import lombok.extern.slf4j.Slf4j;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.NWUserDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;

/**
 *
 * @author Dorina
 */
//@Slf4j
public class SubcontractorDaoImplIntegrationTest extends IntegrationTestBase
{

    @Autowired
    private Subcontractor subcontractor;

    @Autowired
    private SubcontractorDaoIntf subcontractorDao;
    
      @Autowired
    private NWUser nWUser;

    @Autowired
    private NWUserDaoIntf nwuserDao;
    
//      @Autowired
//    private NWRole nWRole;
//
//    @Autowired
//    private NWRoleDaoIntf nwroleDao;

    
    @Before
    public void setUp(){
//    {
//        Integer idRole = this.nwroleDao.save(this.nWRole);
//                Assert.assertNotNull(idRole);
                
         Integer id = this.nwuserDao.save(this.nWUser);
        Assert.assertNotNull(id);
        subcontractor.setUser(nWUser);
        
        this.subcontractorDao.save(this.subcontractor);
    }

    @After
    public void tearDown()
    {
//        this.subcontractorDao.delete(this.subcontractor);
        this.subcontractorDao.delete(subcontractor.getIdSubcontractor());
        
           this.nwuserDao.delete(nWUser.getIdUser());
           
//           this.nwroleDao.delete(nWRole.getUserRoleId());
    }

    @Test
    public void get()
    {
        Subcontractor subcontractorDB = this.subcontractorDao.findById(this.subcontractor.getIdSubcontractor());
        Assert.assertEquals(this.subcontractor, subcontractorDB);
    }
}
