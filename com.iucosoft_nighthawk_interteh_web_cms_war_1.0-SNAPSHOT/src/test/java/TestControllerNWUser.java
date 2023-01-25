
import com.iucosoft.nighthawk_interteh_web_cms.springmvc.webcontrolleri.admin.NWUsersController;
import org.junit.Before;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dorina
 */
public class TestControllerNWUser {
    
    private MockMvc mockMvc ;
    
   @Before
    public void setup(){
        mockMvc = MockMvcBuilders.standaloneSetup(new NWUsersController()).build();
    
    
    }
   @Test
    public void testHomePage() throws Exception{
        mockMvc.perform(get("/admin/nwusers/list"))
                .andExpect(status().isOk());
                
    
    
    
    }
    
}
