package com_Spring.config;



import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer  {

 @Override
    protected Class[] getRootConfigClasses() {
        return new Class[] { Web_config.class};
    }
  
    @Override
    protected Class[] getServletConfigClasses() {
        return null;
    }
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}