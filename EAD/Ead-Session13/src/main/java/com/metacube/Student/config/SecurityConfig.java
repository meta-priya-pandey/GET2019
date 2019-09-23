/*
 * Configuration Class
 */
package com.metacube.Student.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Priya
 *
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	protected void configure(final AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
		.withUser("Priya").password("{noop}priya").roles("ADMIN");
	}
	
	@Override
	protected void configure(final HttpSecurity http)throws Exception{
		http
		.authorizeRequests()
		.antMatchers("/login").permitAll()
		.antMatchers("/**").hasRole("ADMIN")
		.antMatchers("/Image/**","/css/*","/js/**").permitAll()
		.and()
		.formLogin()
		.loginPage("/login")
		.defaultSuccessUrl("/home",true)
		.failureUrl("/login?error=true")
		.and()
		.csrf().disable();
	}
}
