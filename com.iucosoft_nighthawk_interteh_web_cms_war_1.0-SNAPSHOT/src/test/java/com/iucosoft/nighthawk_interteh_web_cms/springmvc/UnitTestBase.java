package com.iucosoft.nighthawk_interteh_web_cms.springmvc;



import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * This is a base test class for non-controller class in testing stage<BR/>
 * with the assistance of this test base class, there is no need to redeploy web server over and over again, which is
 * too time wastage.<BR/>
 * any class that extends this class could have the capability to test without web server deployment
 * <p>

 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =
{
//    TestApplicationContext.class, UnitTestApplicationContext.class
          config.TestApplicationContext.class, com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration.MyWebApplicationConfig.class
})
@WebAppConfiguration
@Ignore
public abstract class UnitTestBase
{
}
