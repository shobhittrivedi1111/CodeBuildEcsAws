package com.example.dockerImpl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DockerImplApplication {

	public static void main(String[] args) {

		SpringApplication.run(DockerImplApplication.class, args);
	}

	@GetMapping("/")
	public String getMessage(){
		return "how are u??";
	}
}
