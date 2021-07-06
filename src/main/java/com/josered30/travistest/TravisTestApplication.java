package com.josered30.travistest;

import com.josered30.travistest.models.Response;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")

@SpringBootApplication
public class TravisTestApplication {

	@GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Response> index() {
		return ResponseEntity.ok().body(new Response("hello world"));
	}

	public static void main(String[] args) {
		SpringApplication.run(TravisTestApplication.class, args);
	}

}
