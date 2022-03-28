package com.example.Demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.autoconfigure.web.WebProperties;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletPath;
//import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration.ResourceHandlerRegistrationCustomizer;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
@Configuration 

public class springconfig extends WebSecurityConfigurerAdapter{
	@Autowired
	 DataSource datasource;
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	       http.authorizeRequests().anyRequest().fullyAuthenticated().and().formLogin().loginPage("/login")
	           .failureUrl("/login?error").permitAll().and().logout().logoutUrl("/logout")
	           .logoutSuccessUrl("/login?logout").permitAll().and().csrf();
	 }
	 @Override protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	     auth.jdbcAuthentication().dataSource(datasource).passwordEncoder(passwordEncoder());
	 }
	 @Bean 
	 public PasswordEncoder passwordEncoder() {
	     PasswordEncoder encoder = new BCryptPasswordEncoder();
	     return encoder;
	 }
	
	
}
