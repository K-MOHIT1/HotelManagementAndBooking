package com.codingshuttle.projects.HotelBookingAndManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HotelBookingAndManagement {

	public static void main(String[] args) {
		SpringApplication.run(HotelBookingAndManagement.class, args);
	}

}
