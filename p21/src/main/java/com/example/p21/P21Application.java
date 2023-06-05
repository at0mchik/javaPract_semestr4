package com.example.p21;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

@SpringBootApplication
public class P21Application {

	public static void main(String[] args) {
//		System.out.println("im working");
		SpringApplication.run(P21Application.class, args);
//		System.out.println("now here");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Bean
	public JavaMailSenderImpl javaMailSenderImpl() {
		return new JavaMailSenderImpl();
	}
}
