package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.ContractDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.ContractProjectDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.ContractProjectIdDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.EmployercompanyDaoIntf;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.ProjectDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Contract;
import com.iucosoft.nighthawk_interteh_service.entities.ContractProject;
import com.iucosoft.nighthawk_interteh_service.entities.ContractProjectId;
import com.iucosoft.nighthawk_interteh_service.entities.Employercompany;
import com.iucosoft.nighthawk_interteh_service.entities.Project;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Dorina
 */
public class ContractProjectDaoImplIntegrationTest extends IntegrationTestBase {

    @Autowired
    private ContractProject contractProject;

    @Autowired
    private ContractProjectDaoIntf contractProjectDao;

    @Autowired
    private Project project;

    @Autowired
    private ProjectDaoIntf projectDao;

    @Autowired
    private Contract contract;

    @Autowired
    ContractDaoIntf contractDao;
    
        @Autowired
    private Employercompany employercompany;
    @Autowired
    private EmployercompanyDaoIntf employercompanyDao;

    @Before
    public void setUp() {
        
         Integer id = this.employercompanyDao.save(this.employercompany);
        Assert.assertNotNull(id);
        

        Integer idCon = this.contractDao.save(this.contract);
        Assert.assertNotNull(idCon);
        Integer idProj = this.projectDao.save(this.project);
        Assert.assertNotNull(idProj);
       
        contractProject.setContract(contract);
        contractProject.setProject(project);
        this.contractProjectDao.save(this.contractProject);

    }

    @After
    public void tearDown() {
        
//        this.contractProjectDao.delete(contractProject.getId());
//  this.contractProjectDao.delete(contractProject.getId());

        this.contractDao.delete(contract.getIdContract());
        this.projectDao.delete(project.getIdProject());
        this.employercompanyDao.delete(employercompany.getIdClientCompany());
    }

   @Test
    public void testSomeMethod() {

//        ContractProject contractProjectDB = this.contractProjectDao.findById(this.contractProject.getId());
//        ContractProjectId projectIdDB = this.contractProjectIdDao.findById(this.contractProjectId.getProjectId());
//        Assert.assertEquals(this.contract, contractProjectDB);
//        Assert.assertEquals(this.project, contractProjectDB);
//        Assert.assertEquals(this.project, projectIdDB);
    }

}
