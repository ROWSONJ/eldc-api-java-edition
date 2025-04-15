package com.Rowson.eldc_api;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EldcApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EldcApiApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationArguments args) {
		return runner->{
			System.out.print("hello world");
		};
	}
}
