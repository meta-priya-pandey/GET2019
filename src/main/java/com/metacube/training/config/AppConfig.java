package com.metacube.training.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.metacube.training.service.MailSender;
import com.metacube.training.service.impl.MockMailSender;
import com.metacube.training.service.impl.SmtpMailSender;

/**
 * @author Priya
 * AppConfig class is used to load the Bean configuration and returns the object of implementation class.
 *
 */
@Configuration
public class AppConfig {
	
//	@Bean
//	@Primary
//	public MailSender smtpMailSender() {
//		return new SmtpMailSender();
//	}
//	
//	
//	@Bean
//	//@Primary
//	public MailSender mockMailSender() {
//		return new MockMailSender();
//	}
}