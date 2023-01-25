package com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.admin;

import com.google.gson.Gson;
import com.iucosoft.nighthawk_interteh_service.dao.concrete.NWUserDaoIntf;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.serviciispring.concrete.intf.NWUserServiceIntf;
import com.iucosoft.nighthawk_interteh_web_cms.springmvc.ControllerClientSideTestBase;
import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 *
 * @author Dorina
 */
@WebAppConfiguration
//@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(MockitoJUnitRunner.class)
//@ContextConfiguration(classes = {com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration.MvcWebApplicationInitializer.class, com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration.MyWebApplicationConfig.class})
public class NWUsersControllerIntegrationTest {//extends ControllerClientSideTestBase {

  
    
 
   
            
//    @Mock
//    private NWUserServiceIntf nwuserService;
//
//    @Mock
//    private NWUserDaoIntf nwuserDao;
//    
//  

//    @InjectMocks
    private NWUsersController usersController;
//
    private MockMvc mockMvc;
    
//    @Autowired
    private Gson GSON;

//    @Autowired
    private NWUser nWUser;

//    @Before
    public void setUp() throws Exception {
        this.save_201();
    }

//    @After
    public void tearDown() throws Exception {
        this.delete_204();
    }
    
    

    private void save_201() throws Exception {
        NWUser nWUserL = new NWUser();
        MvcResult result = this.mockMvc.perform(post("/nWUser")
                .contentType(MediaType.APPLICATION_JSON)
                .content(this.GSON.toJson(nWUserL)))
                .andExpect(status().isCreated())
                .andReturn();
        Integer resultID = Integer.parseInt(result.getResponse().getContentAsString());
        Assert.assertEquals(resultID, this.nWUser.getIdUser());
    }

//    @Test
    public void save_409() throws Exception {
        MvcResult result = this.mockMvc.perform(post("/nWUser")
                .contentType(MediaType.APPLICATION_JSON)
                .content(this.GSON.toJson(this.nWUser)))
                .andExpect(status().isConflict())
                .andReturn();
        Integer resultID = Integer.parseInt(result.getResponse().getContentAsString());
        Assert.assertEquals(resultID, this.nWUser.getIdUser());
    }

    private void delete_204() throws Exception {
        this.mockMvc.perform(delete("/nWUser/{idUser}", this.nWUser.getIdUser()))
                .andExpect(status().isNoContent());
    }

//    @Test
    public void delete_404() throws Exception {
        this.mockMvc.perform(delete("/nWUser/{idUser}", 0))
                .andExpect(status().isNotFound());
    }

//    @Test
    public void get_200() throws Exception {
        this.mockMvc.perform(get("/nWUser/{idUser}", this.nWUser.getIdUser()))
                .andExpect(status().isOk());
    }

//    @Test
    public void get_404() throws Exception {
        this.mockMvc.perform(get("/nWUser/{idUser}", 0))
                .andExpect(status().isNotFound());
    }

    /**
     *
     * @throws java.lang.Exception
     */
//    @Before
//    public void setUp() throws Exception {
//
//        MockitoAnnotations.initMocks(this);
////        this.mockMvc = MockMvcBuilders.standaloneSetup(this.usersController).build();
//        mockMvc = MockMvcBuilders.standaloneSetup(usersController).build();
////        this.mockMvc = MockMvcBuilders.standaloneSetup(new NWUsersController()).build();
//
////   this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
//
//    }
//@Test
//    public void testList() throws Exception{
//    List<NWUser> lista = new ArrayList<>();
//    lista.add( nWUser);
////    lista.add( nWUser);
//    
//    
//    when(nwuserService.list()).thenReturn((List) lista);
//    
//  mockMvc.perform(get("/admin/nwusers/list"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("admin.nwusers.list.def"))
//                .andExpect(model().attribute("nwUserDTOList", lista.size()));
//    }
//    
//    
//    @Test
//    public void testInitBinder() {
//        System.out.println("initBinder");
//        WebDataBinder binder = null;
//        NWUsersController instance = new NWUsersController();
//        instance.initBinder(binder);
//    }
//    @After
//    public void tearDown() {
//    }
//
//    /**
//     * Test of initBinder method, of class NWUsersController.
//     */
//    @Test
//    public void testInitBinder() {
//        System.out.println("initBinder");
//        WebDataBinder binder = null;
//        NWUsersController instance = new NWUsersController();
//        instance.initBinder(binder);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of list method, of class NWUsersController.
//     */
//    @Test
//    public void testList() throws Exception {
//        List<NWUser> nWUsersList = new ArrayList<>();
//        nWUsersList.add(nWUser);
//
//        when(nwuserService.list()).thenReturn((List) nWUsersList);
//
//        mockMvc.perform(get("/admin/nwusers/list"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("admin.nwusers.list.def"))
//                .andExpect(model().attribute("nwUserDTOList", nWUsersList.size()));
//
//    }
//
//    /**
//     * Test of showView method, of class NWUsersController.(
//     */
//    @Test
//    public void testShowView() {
//        System.out.println("showView");
//        int idUser = 0;
//        Model model = null;
//        NWUsersController instance = new NWUsersController();
//        String expResult = "";
//        String result = instance.showView(idUser, model);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of saveOrUpdateUser method, of class NWUsersController.
//     */
//    @Test
//    public void testSaveOrUpdateUser() {
//        System.out.println("saveOrUpdateUser");
//        NWUserDTO nwUserDTO = null;
//        BindingResult result_2 = null;
//        Model model = null;
//        RedirectAttributes redirectAttributes = null;
//        NWUsersController instance = new NWUsersController();
//        String expResult = "";
//        String result = instance.saveOrUpdateUser(nwUserDTO, result_2, model, redirectAttributes);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of showAddNewUser method, of class NWUsersController.
//     */
//    @Test
//    public void testShowAddNewUser() {
//        System.out.println("showAddNewUser");
//        Model model = null;
//        NWUsersController instance = new NWUsersController();
//        String expResult = "";
//        String result = instance.showAddNewUser(model);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of showEdit method, of class NWUsersController.
//     */
//    @Test
//    public void testShowEdit() {
//        System.out.println("showEdit");
//        int idUser = 0;
//        Model model = null;
//        NWUsersController instance = new NWUsersController();
//        String expResult = "";
//        String result = instance.showEdit(idUser, model);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of deleteUser method, of class NWUsersController.
//     */
//    @Test
//    public void testDeleteUser() {
//        System.out.println("deleteUser");
//        int idUser = 0;
//        RedirectAttributes redirectAttributes = null;
//        NWUsersController instance = new NWUsersController();
//        String expResult = "";
//        String result = instance.deleteUser(idUser, redirectAttributes);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of disableUser method, of class NWUsersController.
//     */
//    @Test
//    public void testDisableUser() {
//        System.out.println("disableUser");
//        int idUser = 0;
//        RedirectAttributes redirectAttributes = null;
//        NWUsersController instance = new NWUsersController();
//        String expResult = "";
//        String result = instance.disableUser(idUser, redirectAttributes);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
