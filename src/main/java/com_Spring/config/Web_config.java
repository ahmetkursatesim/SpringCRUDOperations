package com_Spring.config;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jndi.JndiTemplate;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com_Spring" })
public class Web_config extends WebMvcConfigurerAdapter {
	
	 
	 @Autowired
	 DataSource sourcedata;
	 
	 @Bean
	 public NamedParameterJdbcTemplate geNamedParameterJdbcTemplate(){
	  return new NamedParameterJdbcTemplate(sourcedata);
	 }
	 
	 @Bean
	 public DataSource getDataSource() throws NamingException{
	  JndiTemplate jndiTemp = new JndiTemplate();
	  DataSource sourceData = (DataSource) jndiTemp.lookup("java:comp/env/jdbc/mvc");
	  
	  return sourceData;
	 }
	 
	 @Override
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	  registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	 }
	 
	 @Bean
	 public InternalResourceViewResolver viewResolver(){
	  InternalResourceViewResolver viewRes = new InternalResourceViewResolver();
	  viewRes.setViewClass(JstlView.class);
	  viewRes.setPrefix("/WEB-INF/jsp/");
	  viewRes.setSuffix(".jsp");
	  
	  return viewRes;
	 }
	 
}
