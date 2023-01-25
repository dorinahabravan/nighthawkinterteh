package config;




import org.hibernate.SessionFactory;
import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author Dorina
 */
@ComponentScan("com.iucosoft")
@Configuration
public class UnitTestApplicationContext
{

    @Bean
    public SessionFactory sessionFactory()
    {
        
        SessionFactory sessionFactory = Mockito.mock(SessionFactory.class);
        return sessionFactory;
    }
    
    
//    @Bean
//    public Session session(SessionFactory sessionFactory)
//    {
//        Session session = sessionFactory.openSession();
//        
//               return session;
//    }
    
    
}
