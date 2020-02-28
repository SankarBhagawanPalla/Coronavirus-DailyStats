package com.javaworks.coronavirusstats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoronavirusStatsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoronavirusStatsApplication.class, args);
	}

}
