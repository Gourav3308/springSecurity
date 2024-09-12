package com.springLogin.SpringRestLogin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoginRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginRestApplication.class, args);
		System.out.println("Your server is started");
	}

}
