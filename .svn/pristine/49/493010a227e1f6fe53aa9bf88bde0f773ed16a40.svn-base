
package com.iucosoft.nighthawk_interteh_service.dao.impl.implconcrete;

import com.iucosoft.nighthawk_interteh_service.IntegrationTestBase;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.FilecontentDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.Filecontent;
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
public class FilecontentDaoImplIntegrationTest extends IntegrationTestBase{
    
  @Autowired
   private Filecontent fileContent;
  
  @Autowired
  private FilecontentDaoIntf filecontentDao;
  
    
    @Before
    public void setUp() {
        
        this.filecontentDao.save(this.fileContent);
    }
    
    @After
    public void tearDown() {
        this.filecontentDao.delete(fileContent.getDocumentContentId());
    }

    @Test
    public void testSomeMethod() {
      Filecontent fileContentDB = this.filecontentDao.findById(this.fileContent.getDocumentContentId());
      Assert.assertEquals( this.fileContent ,fileContentDB);
    }
    
}
