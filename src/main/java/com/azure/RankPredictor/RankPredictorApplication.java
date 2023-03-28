package com.azure.RankPredictor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RankPredictorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RankPredictorApplication.class, args);
	}

	@GetMapping("/helloworld")
	public String hello() {
		return "Hello World!";
	}
}
