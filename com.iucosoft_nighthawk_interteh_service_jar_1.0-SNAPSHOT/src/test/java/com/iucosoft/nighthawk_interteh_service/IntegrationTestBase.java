package com.iucosoft.nighthawk_interteh_service;



import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author Dorina
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes =
{
    config.TestApplicationContext.class, com.iucosoft.nighthawk_interteh_service.configuration.AppConfig.class
})

@Ignore
public abstract class IntegrationTestBase
{
}
