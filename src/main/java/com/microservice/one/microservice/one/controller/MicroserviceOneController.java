package com.microservice.one.microservice.one.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.one.microservice.one.entities.Hello;
import com.microservice.one.microservice.one.repository.HelloRepository;
import com.microservice.one.microservice.one.service.HelloService;

@RestController
public class MicroserviceOneController {

	@Autowired
	HelloService helloService;

	@GetMapping("/hello")
	public Hello testMethod() {
		List<String> list = new ArrayList<>();
		list.add("asf");
		list.add("adfxzcxzcf");
		Hello hello = new Hello();
		hello.setName("guatam");
		hello.setDesignation("engineer");
		hello.setSubject(list);

		return hello;
	}

	@GetMapping("/repo")
	public List<Hello> getFromDatabase() {
		return helloService.getAllHelloDetails();
	}

	@GetMapping("/set")
	public Hello setIntoDatabase() {
		List<String> list = new ArrayList<>();
		list.add("asf");
		list.add("adfxzcxzcf");
		Hello hello = new Hello();
		hello.setName("guatam");
		hello.setDesignation("engineer");
		hello.setSubject(list);
		Hello save = helloService.saveHelloDetails(hello);
		return save;
	}
}