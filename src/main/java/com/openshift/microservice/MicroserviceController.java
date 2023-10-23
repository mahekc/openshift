package com.openshift.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceController {

	@GetMapping("hello-world")
	public String helloWorld(){
		return "Hello World modified!!";
	}
}
