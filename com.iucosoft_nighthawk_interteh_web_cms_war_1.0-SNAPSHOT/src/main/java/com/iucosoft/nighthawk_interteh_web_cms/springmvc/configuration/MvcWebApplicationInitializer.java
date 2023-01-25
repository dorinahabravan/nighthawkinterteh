package com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

@Configuration
public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
//        	return new Class[] { MyWebApplicationConfig.class };
////		return new Class[]{WebSecurityConfig.class};
        return null;
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
























//
//
////import com.iucosoft.nighthawk_interteh_service.configuration.AppConfig;
//import com.iucosoft.nighthawk_interteh_service.configuration.AppConfig;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//
//@Configuration
//public class MvcWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
//
//  // Load database and spring security configuration
//  @Override
//  protected Class<?>[] getRootConfigClasses() {
////        return new Class[]{};
// return new Class[] { AppConfig.class , MyWebApplicationConfig.class};
//
////Am schimbat rindul 18
////    return new Class[] { AppConfig.class};
//            }
// 
//  
//  // Load spring web configuration
//  @Override
//  protected Class<?>[] getServletConfigClasses() {
//    return new Class[] { MyWebApplicationConfig.class };
//  }
//
//  @Override
//  protected String[] getServletMappings() {
//    return new String[] { "/" };
//    
//    
//  }
//
//
//}

