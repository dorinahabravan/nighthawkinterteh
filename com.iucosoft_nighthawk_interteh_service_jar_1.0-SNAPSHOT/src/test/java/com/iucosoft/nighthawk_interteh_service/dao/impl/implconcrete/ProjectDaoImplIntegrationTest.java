package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.AccountDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.ProjectDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Account;
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
public class ProjectDaoImplIntegrationTest extends IntegrationTestBase {
    
    @Autowired
    private Project project;
    
    @Autowired
    private ProjectDaoIntf projectDao;
    
    @Autowired
    private Account account;
    
    @Autowired
    private AccountDaoIntf accountDao;
    
    @Before
    public void setUp() {
        
        Integer id = this.accountDao.save(account);
        Assert.assertNotNull(id);
        project.setAccount(account);
        this.projectDao.save(this.project);
    }
    
    @After
    public void tearDown() {
        
        this.projectDao.delete(project.getIdProject());
        this.accountDao.delete(account.getIdAccount());
    }
    
    @Test
    public void get() {
        Project projectDB = this.projectDao.findById(this.project.getIdProject());
        Assert.assertEquals(this.project, projectDB);
    }
    
}
