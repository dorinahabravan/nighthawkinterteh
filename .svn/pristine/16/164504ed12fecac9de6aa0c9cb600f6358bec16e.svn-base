
package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.FiledocumentDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Filedocument;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Dorina
 */
public class FiledocumentDaoImplIntegrationTest extends IntegrationTestBase{
    
    
   @Autowired
   
   private Filedocument filedocument;
   
   @Autowired
   
   private FiledocumentDaoIntf fileDocumentDao;
   
    
    @Before
    public void setUp() {
        
        this.fileDocumentDao.save(this.filedocument);
    }
    
    @After
    public void tearDown() {
        
        this.fileDocumentDao.delete(filedocument.getDocumentId());
    }

    @Test
    public void testSomeMethod() {
        Filedocument filedocumentDB = this.fileDocumentDao.findById(this.filedocument.getDocumentId());
        Assert.assertEquals(this.filedocument,  filedocumentDB);
     
    }
    
}
