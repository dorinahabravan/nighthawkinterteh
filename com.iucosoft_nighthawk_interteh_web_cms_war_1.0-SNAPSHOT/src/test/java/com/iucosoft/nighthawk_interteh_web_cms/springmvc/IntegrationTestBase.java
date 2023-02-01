package com.iucosoft.nighthawk_interteh_web_cms.springmvc;



import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dorina
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =
{
    config.TestApplicationContext.class,  com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration.MyWebApplicationConfig.class
})

@Transactional
@Ignore
public abstract class IntegrationTestBase
{
}
