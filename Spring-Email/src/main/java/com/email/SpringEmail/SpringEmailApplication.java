package com.email.SpringEmail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailApplication {

	@Autowired
	private SendEmailServer senderService;
	
	
	public static void main(String[] args) {
		SpringApplication.run(SpringEmailApplication.class, args);
		
		
	}
	
	@EventListener(ApplicationReadyEvent.class)
	public void sendEmail() {
		senderService.sendEmail("", "Test Email", "Hello, This is a test Email! ");
		
		
	}

}
