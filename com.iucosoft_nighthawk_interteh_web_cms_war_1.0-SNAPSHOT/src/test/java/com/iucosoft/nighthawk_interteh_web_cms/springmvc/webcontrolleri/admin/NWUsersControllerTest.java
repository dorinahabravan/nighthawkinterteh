package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.admin;

import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWUserServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.springmvc.ControllerClientSideTestBase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;


/**
 *
 * @author Dorina
 */
//@WebAppConfiguration
//@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(MockitoJUnitRunner.class)
//@ContextConfiguration(classes = {com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration.MvcWebApplicationInitializer.class, com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration.MyWebApplicationConfig.class})
//@Slf4j
public class NWUsersControllerTest extends ControllerClientSideTestBase {

    @Mock
    @Qualifier("nwuserService")
    NWUserServiceIntf nwuserServiceMock;

    @Autowired
    private NWUser nWUser;

    @Autowired
    NWUsersController usersController;

    private MockMvc mockMvc;

    public NWUsersControllerTest() {
    }
    
       @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
//        Mockito.when(this.personServiceMock).thenReturn(this.personServiceMock);
//        this.personWebController.setPersonService(this.personServiceMock);
        this.mockMvc = MockMvcBuilders.standaloneSetup(this.usersController).build();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of testList method, of class NWUsersControllerTest.
     * @throws java.lang.Exception
     */
    @Test
    public void testList() throws Exception {
        List <NWUser> list = new ArrayList<>();
                list.add(nWUser);
                list.add(nWUser);
 


       
//        when(nwuserServiceMock.list()).thenReturn((List) list);
                when(nwuserServiceMock.list()).thenReturn(Arrays.asList(nWUser));

 
        
        
        
        ResultActions andExpect = mockMvc.perform(get("/admin/nwusers/list"))
                .andExpect(status().isOk())
                .andExpect(forwardedUrl("admin.nwusers.list.def"))
                .andExpect(view().name("admin.nwusers.list.def"));
//                .andExpect(model().attribute("nWUser", Arrays.asList(nWUser)));
//                .andExpect(model().attribute("nwUserDTOList", Arrays.asList(nWUser)));
//                .andExpect(model().attribute("user", Arrays.asList(nWUser)));

}
    




}
