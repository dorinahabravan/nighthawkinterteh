package com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

//    @Override
//    protected Class<?>[] getRootConfigClasses() {
////        	return new Class[] { MyWebApplicationConfig.class };
//////		return new Class[]{WebSecurityConfig.class};
//        return null;
//    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return null;
      	
//        return new Class[]{SecurityConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
		return new Class[] { MyWebApplicationConfig.class};
//        return null;
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/", "*.htm"};
    }

}
























