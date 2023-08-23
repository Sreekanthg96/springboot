package com.Sopheon.realstate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.webing.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RealstateApplication {

	public static void main(String[] args) {
		SpringApplication.run(primarySource:RealstateApplication.class, args);
	}
	 @GetMapping("/test")
	public String index(){
		return "Hey Guys! This is Sreekanth Gorrela!";
	}

}
