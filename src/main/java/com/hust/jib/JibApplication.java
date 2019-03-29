package com.hust.jib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class JibApplication {

	public static void main(String[] args) {
		SpringApplication.run(JibApplication.class, args);
	}

	@Controller
	private final class MyController {

		@GetMapping
		public ResponseEntity<String> root() {
			return ResponseEntity.ok("hello from hust");
		}

	}

}

