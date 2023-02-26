package com.fetcher.drivinglicence;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DrivingLicenceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DrivingLicenceApplication.class, args);
		System.out.println("Application has been started");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application has been started");
	}
}
