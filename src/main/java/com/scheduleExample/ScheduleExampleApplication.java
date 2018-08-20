package com.scheduleExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ScheduleExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScheduleExampleApplication.class, args);
	}
}
