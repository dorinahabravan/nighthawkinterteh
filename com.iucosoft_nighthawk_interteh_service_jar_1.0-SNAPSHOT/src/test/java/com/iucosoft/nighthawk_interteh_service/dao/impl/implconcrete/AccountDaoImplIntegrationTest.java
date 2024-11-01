package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.AccountDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.NWUserDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.ProjectDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Account;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.entities.Project;
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
public class AccountDaoImplIntegrationTest extends IntegrationTestBase {

    @Autowired
    private Account account;

    @Autowired
    private AccountDaoIntf accountDao;

    @Autowired
    private NWUserDaoIntf nwuserDao;

    @Autowired
    private NWUser nWUser;

    @Autowired
    private Project project;


    @Before
    public void setUp() {

        
//      Integer idProject =  this.projectDao.save(this.project);
//        Assert.assertNotNull(idProject);
//        account.getProjects().add(project);
//        this.accountDao.save(this.account);
        
        
        Integer id = this.nwuserDao.save(this.nWUser);
        Assert.assertNotNull(id);
        account.setUser(nWUser);
        this.accountDao.save(this.account);
    }

    @After
    public void tearDown() {

        this.accountDao.delete(account.getIdAccount());
        NWUser nWUserTemp = nwuserDao.findById(nWUser.getIdUser());
        Assert.assertNotNull(nWUserTemp);
        Assert.assertEquals(nWUserTemp.getUsername(), nWUser.getUsername());

        this.nwuserDao.delete(nWUser.getIdUser());
    }

    @Test
    public void get() {

        Account accountDB = this.accountDao.findById(this.account.getIdAccount());
        Assert.assertEquals(this.account, accountDB);
    }

    @Test
    public void addProject() {
      this.accountDao.addProject(project, account);

    }

//     @Override
//    public void addProject(Project project, Account account) {
//        account.getProjects().add(project);
//        
//    }
}
