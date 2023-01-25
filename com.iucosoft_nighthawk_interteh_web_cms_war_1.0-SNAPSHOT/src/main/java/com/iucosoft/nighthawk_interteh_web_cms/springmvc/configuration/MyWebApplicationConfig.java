package com.iucosoft.nighthawk_interteh_web_cms.springmvc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;


/**
 *
 * @author Dorina
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.iucosoft"})

public class MyWebApplicationConfig implements WebMvcConfigurer {
//public class MyWebApplicationConfig extends WebMvcConfigurerAdapter{

    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions(
                new String[]{"/WEB-INF/tiles.xml"});
        tilesConfigurer.setCheckRefresh(true);

        return tilesConfigurer;
    }


    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        TilesViewResolver viewResolver = new TilesViewResolver();
        registry.viewResolver(viewResolver);
    }

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**")
//          .addResourceLocations("/static/");
//    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }

    @Bean
    public ResourceBundleMessageSource messageSource() {
        ResourceBundleMessageSource rb = new ResourceBundleMessageSource();
        rb.setBasenames(new String[]{"locale/messages", "locale/validation"});
        return rb;
    }
    
    
    
    
//    De aici
    
//      @Override
//    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> argumentResolvers)
//    {
//        argumentResolvers.add(new FormModelMethodArgumentResolver());
//    }
    
//        @Override
//    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer)
//    {
//        configurer.enable();
//    }
//    
//    
//  
//    
// @Override
//    public void configureContentNegotiation(ContentNegotiationConfigurer configurer)
//    {
//        configurer.favorPathExtension(false).favorParameter(false);
//        configurer.defaultContentType(MediaType.APPLICATION_JSON);
//    }
//
//    @Override
//    public void configureMessageConverters(List<HttpMessageConverter<?>> converters)
//    {
//        converters.add(gsonHttpMessageConverter());
//        converters.add(byteArrayHttpMessageConverter());
//    }
//
//    private HttpMessageConverter byteArrayHttpMessageConverter()
//    {
//        ByteArrayHttpMessageConverter messageConverter = new ByteArrayHttpMessageConverter();
//        List<MediaType> supportedMediaTypes = new ArrayList<>();
//        supportedMediaTypes.add(MediaType.IMAGE_GIF);
//        supportedMediaTypes.add(MediaType.IMAGE_JPEG);
//        supportedMediaTypes.add(MediaType.IMAGE_PNG);
//        messageConverter.setSupportedMediaTypes(supportedMediaTypes);
//        return messageConverter;
//    }
//
//    private HttpMessageConverter gsonHttpMessageConverter()
//    {
//        GsonHttpMessageConverter messageConverter = new GsonHttpMessageConverter();
//        messageConverter.setGson(new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create());
//        List<MediaType> supportedMediaTypes = new ArrayList<>();
//        supportedMediaTypes.add(MediaType.APPLICATION_JSON);
//        messageConverter.setSupportedMediaTypes(supportedMediaTypes);
//        return messageConverter;
//    }
//
//    @Bean
//    public InternalResourceViewResolver viewResolver()
//    {
//        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//        resolver.setPrefix("/WEB-INF/pages/");
//        resolver.setSuffix(".jsp");
//        return resolver;
//    }
//
//    @Bean
//    public HandlerAdapter handlerAdapter()
//    {
//        RequestMappingHandlerAdapter adapter = new RequestMappingHandlerAdapter();
//        return adapter;
//    }
//
//    @Bean
//    public AbstractHandlerMapping defaultAnnotationHandlerMapping()
//    {
//        RequestMappingHandlerMapping mapping = new RequestMappingHandlerMapping();
//        mapping.setUseSuffixPatternMatch(false);
//        //Seems those parameters not important anymore after I use URI as parameter instead
////        mapping.setUrlDecode(false);
////        mapping.setAlwaysUseFullPath(true);
//        return mapping;
//    }
//
//    @Override
//    public void addCorsMappings(CorsRegistry registry)
//    {
//        registry.addMapping("/**");
//    }
}
