package com.iucosoft.nighthawk_interteh_web_cms.springmvc;

import org.junit.Before;
import org.junit.Ignore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;

/**
 * This is a base test class for JUNIT test in controller testing<BR/>
 * It is really a very simple but useful test class, which skipped using web server, hence saved a
 * lot of time in
 * deployment!
 *

 */
@WebAppConfiguration
@ContextConfiguration(classes = {com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration.MvcWebApplicationInitializer.class,com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration.MyWebApplicationConfig.class})
@Ignore
public abstract class ControllerServerSideTestBase extends UnitTestBase
{

    /**
     * This is a request handler used to map all request into handle ACTION class.
     */
    @Autowired
    public RequestMappingHandlerAdapter handlerAdapter;

    protected MockHttpServletRequest request;

    protected MockHttpServletResponse response;

    @Before
    public void before()
    {
        request = new MockHttpServletRequest();
        request.setCharacterEncoding("UTF-8");
        response = new MockHttpServletResponse();
    }
}
