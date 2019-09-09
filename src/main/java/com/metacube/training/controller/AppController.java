package com.metacube.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metacube.training.service.MailSender;

/**
 * @author Priya 
 * AppController class handles the UI request based on given URL mapping and returns processed result.
 *
 */
@RestController
public class AppController {

	@Autowired
	private MailSender mailSender;
	
	@RequestMapping("/sendMail")
	public String sendMail() {
		mailSender.sendMail();
		return "Please check your mailbox";
	}
	
	// Setter method injection
	public void setMailSender(MailSender mailSender) {
		this.mailSender = mailSender;
	}
	
	// Constructor injection
//	public void AppController(MailSender mailSender) {
//		this.mailSender = mailSender;
//	}
	
	@RequestMapping("/writeMail")
	public String writeMail() {
		mailSender.writeMail();
		return "Your mail content is printed on console";
	}
}