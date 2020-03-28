package com.app.utils;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ResourceConfig {
	
	@Value("${spring.datasource.driver-class-name}")
	private String driverClass;
	
	@Value("${spring.datasource.url}")
	private String url;
	
	@Value("${spring.datasource.username}")
	private String userName;
	
	@Value("${spring.datasource.password}")
	private String password;
	
	 @Bean()
	 public DataSource getDataSource() {
	     DataSourceBuilder<?> dataSourceBuilder = DataSourceBuilder.create();
	     dataSourceBuilder.url(url);
	     dataSourceBuilder.username(userName);
	     dataSourceBuilder.password(password);
	     return dataSourceBuilder.build();
	 }
	 
	 /*@Bean("inMemDataSource")
	 public DataSource getH2DataSource() {
		 DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
	     dataSourceBuilder.driverClassName("org.h2.Driver");
	     dataSourceBuilder.url("jdbc:h2:mem:test");
	     dataSourceBuilder.username("SA");
	     dataSourceBuilder.password("");
	     return dataSourceBuilder.build();
	 }*/
	
}
