package config;

import com.iucosoft.nighthawk_interteh_service.entities.NWRole;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.entities.Project;
import com.iucosoft.nighthawk_interteh_service.entities.Subcontractor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author Dorina
 */
@Configuration
public class TestApplicationContext {


    @Bean
    @Scope("prototype")
    public Subcontractor subcontractor(NWUser nWUser) {
        Subcontractor subcontractor = new Subcontractor();
        subcontractor.setSubcontractorName("TEST");
        subcontractor.setIdSubcontractor(100);
        subcontractor.setUser(nWUser);
        return subcontractor;
    }

    @Bean
    @Scope("prototype")
    public NWUser nWUser(NWRole nwRole) {
        NWUser nWUser = new NWUser();
        nWUser.setActive(true);
        nWUser.setUsername("admin");
        nWUser.setPassword("123");
        nWUser.setIdUser(1);
        nWUser.setRole(nwRole);
        return nWUser;
    }

    @Bean
    @Scope("prototype")
    public NWRole nWRole() {
        NWRole nWRole = new NWRole();
        nWRole.setEnabled(true);
        nWRole.setUserRoleId(1);
        nWRole.setUserRoleName("admin");

        return nWRole;
    }

    @Bean
    @Scope("prototype")
    public Project project() {
        Project project = new Project();
        project.setIdProject(1);
        project.setProjectCompanyId(1);
        project.setProjectName("Fibre");
        project.setProjectStatus("active");

        return project;
    }

}
