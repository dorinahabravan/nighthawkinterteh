package config;

import com.iucosoft.nighthawk_interteh_service.entities.Account;
import com.iucosoft.nighthawk_interteh_service.entities.Administrator;
import com.iucosoft.nighthawk_interteh_service.entities.Companysubcontractor;
import com.iucosoft.nighthawk_interteh_service.entities.Contract;
import com.iucosoft.nighthawk_interteh_service.entities.ContractProject;
import com.iucosoft.nighthawk_interteh_service.entities.ContractProjectId;
import com.iucosoft.nighthawk_interteh_service.entities.Employercompany;
import com.iucosoft.nighthawk_interteh_service.entities.Filecontent;
import com.iucosoft.nighthawk_interteh_service.entities.Filedocument;
import com.iucosoft.nighthawk_interteh_service.entities.NWRole;
import com.iucosoft.nighthawk_interteh_service.entities.NWUser;
import com.iucosoft.nighthawk_interteh_service.entities.Nighthawkinterteh;
import com.iucosoft.nighthawk_interteh_service.entities.Payment;
import com.iucosoft.nighthawk_interteh_service.entities.Payroll;
import com.iucosoft.nighthawk_interteh_service.entities.Person;
import com.iucosoft.nighthawk_interteh_service.entities.Portofolio;
import com.iucosoft.nighthawk_interteh_service.entities.Project;
import com.iucosoft.nighthawk_interteh_service.entities.Subcontractor;
import java.util.Set;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 *
 * @author Dorina
 */
@Configuration
public class TestApplicationContext {
//    @Bean
//    public Gson gson()
//    {
//        return new Gson();
//    }
//

    @Bean
    @Scope("prototype")
    public Subcontractor subcontractor(NWUser nWUser) {
        Subcontractor subcontractor = new Subcontractor();
        subcontractor.setSubcontractorName("Eugen2");
        subcontractor.setIdSubcontractor(4);
        subcontractor.setUser(nWUser);
      
        return subcontractor;
    }

    @Bean
    @Scope("prototype")
    public NWUser nWUser( ) {
        NWUser nWUser = new NWUser();
        nWUser.setActive(true);
        nWUser.setUsername("admin83");
        nWUser.setPassword("83");
        nWUser.setIdUser(83);
//        nWUser.setRole(nwRole);
        nWUser.setRole( nWRole());
        
       
        return nWUser;
    }

    @Bean
    @Scope("prototype")
    public NWRole nWRole() {
        NWRole nWRole = new NWRole();
        nWRole.setEnabled(true);
        nWRole.setUserRoleId(6);
        nWRole.setUserRoleName("admin6");
//        Set<NWUser> set = new HashSet<>();
//        set.add(nWUser);
//        nWRole.setUsers(set);

        return nWRole;
    }

    @Bean
    @Scope("prototype")
    public Project project(Account account, Employercompany employercompany, Nighthawkinterteh nighthawkinterteh) {
        Project project = new Project();
        project.setIdProject(1);
        project.setProjectCompanyId(1);
        project.setProjectName("Fibre");
        project.setProjectStatus("active");
        project.setAccount(account);

        return project;

    }

    @Bean
    @Scope("prototype")
    public Account account(NWUser nWUser) {
        Account account = new Account();
        account.setIdAccount(8);
        account.setIdPortofolio(8);
        account.setUser(nWUser);
        
        
        
        

        return account;
    }

    @Bean
    @Scope("prototype")
    public Nighthawkinterteh nighthawkinterteh() {
        Nighthawkinterteh nighthawkinterteh = new Nighthawkinterteh();
        nighthawkinterteh.setIdCompany(5);
        nighthawkinterteh.setCompanyAddress("Moldova");
        nighthawkinterteh.setCompanyName("Companie");
        nighthawkinterteh.setCompanyType("AAAA");

        return nighthawkinterteh;

    }

    @Bean
    @Scope("prototype")
    public Contract contract(Subcontractor subcontractor, Nighthawkinterteh nighthawkinterteh, Employercompany employercompany) {
        Contract contract = new Contract();
        contract.setIdContract(7);
        contract.setContractName("AAAA");
        contract.setContractType("sssss");
        contract.setContractType("sssss");
        contract.setSubcontractor(subcontractor);
        contract.setNighthawkinterteh(nighthawkinterteh);
        contract.setEmployercompany(employercompany);

        return contract;

    }

    @Bean
    @Scope("prototype")
    public Employercompany employercompany() {
        Employercompany employercompany = new Employercompany();
        employercompany.setIdClientCompany(17);
        employercompany.setClientCompanyName("ssss");
        employercompany.setClientCompanyType("ltd");

        return employercompany;

    }

    @Bean
    @Scope("prototype")
    public Administrator administrator(NWUser nWUser) {
        Administrator administrator = new Administrator();
        administrator.setIdAdministrator(2);
        administrator.setAdministratorName("Bogdan7036");
        administrator.setUser(nWUser);

        return administrator;

    }

    @Bean
    @Scope("prototype")
    public Companysubcontractor companysubcontractor(Subcontractor subcontractor) {
        Companysubcontractor companysubcontractor = new Companysubcontractor();
        companysubcontractor.setId(1);
        companysubcontractor.setCompanySubcontractorName("LTD");
        companysubcontractor.setCompanySubcontractorPhoneNumber(0666);
        companysubcontractor.setSubcontractor(subcontractor);

        return companysubcontractor;

    }

    @Bean
    @Scope("prototype")
    public Filecontent fileContent(Filedocument filedocument) {
        Filecontent fileContent = new Filecontent();
        fileContent.setDocumentContentId(1);
        fileContent.setFileContent("fffff");
        fileContent.setFiledocument(filedocument);

        return fileContent;

    }

    @Bean
    @Scope("prototype")
    public Filedocument filedocument(Account account) {
        Filedocument filedocument = new Filedocument();
        filedocument.setFileDocumentId(1);
        filedocument.setFileName("document");
        filedocument.setFileExtenstion("txt");
        filedocument.setAccount(account);

        return filedocument;

    }

    @Bean
    @Scope("prototype")
    public Payroll payroll(NWUser nWUser) {
        Payroll payroll = new Payroll();
        payroll.setIdPayroll(1);
        payroll.setPayrollName("Lucas");
        payroll.setPayrollEmail("payroll@gmail.com");
        payroll.setUser(nWUser);

        return payroll;

    }

    @Bean
    @Scope("prototype")
    public Payment payment(Contract contract) {
        Payment payment = new Payment();
        payment.setIdPayment(1);
        payment.setPaymentType("succes");
        payment.setContract(contract);

        return payment;

    }

    @Bean
    @Scope("prototype")
    public Portofolio portofolio(Account account) {
        Portofolio portofolio = new Portofolio();
        portofolio.setDocumentId(5);
        portofolio.setFileName("ffff");
        portofolio.setAccount(account);

        return portofolio;

    }

    @Bean
    @Scope("prototype")
    public Person person(Subcontractor subcontractor) {
        Person person = new Person();
        person.setIdPerson(1);
        person.setPersonName("Eugen");
        person.setSubcontractor(subcontractor);

        return person;

    }
    
    @Bean
    @Scope("prototype")
    public ContractProject contractProject( Contract contract , Project project ,Employercompany employercompany) {
        ContractProject contractProject = new ContractProject();
        contractProject.setContract(contract);
        contractProject.setProject(project);
       
    
     
//      contractProject.setProject(project);
//      contractProject.setId(id);

        return contractProject;

    }

}
