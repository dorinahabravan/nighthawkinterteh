package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.admin;

import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_web_cms.springmvc.ControllerServerSideTestBase;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Dorina
 */
//@WebAppConfiguration
//@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(MockitoJUnitRunner.class)
//@ContextConfiguration(classes = {com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration.MvcWebApplicationInitializer.class, com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration.MyWebApplicationConfig.class})

@Slf4j
public class NWUsersControllerIntegrationTest extends ControllerServerSideTestBase {

  
  

   @Autowired
    NWUsersController usersController;

    public NWUsersControllerIntegrationTest() {
    }
   
   

    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    


    
      /**
     * Test of arataLista method, of class PersonWebController.
     */
    @Test
    public void list() {
        
        System.out.println("showList");
      //  PersonWebController instance = new PersonWebController();
        
        
        
        ModelAndView expResult = null;
        ModelAndView result = usersController.list();
        /*
        result.getStatus()
        result.getModel()
        result.getModelMap().getAttribute(string)
        result.getView()
        result.getViewName()
          */      
        assertEquals("admin.nwusers.list.def", result.getViewName());
        assertNotNull(result.getModelMap().getAttribute("nwUserDTOList")  );
        assertEquals(5, ((List<NWUser>)result.getModelMap().getAttribute("nwUserDTOList") ).size()  );
    
    }
    
}

