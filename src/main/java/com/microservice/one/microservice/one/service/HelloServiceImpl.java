package com.microservice.one.microservice.one.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservice.one.microservice.one.entities.Hello;
import com.microservice.one.microservice.one.repository.HelloRepository;

@Service
public class HelloServiceImpl implements HelloService {

	@Autowired
	HelloRepository helloRepository;

	@Override
	public List<Hello> getAllHelloDetails() {

		return helloRepository.findAll();
	}

	@Override
	public Hello saveHelloDetails(Hello hello) {
		return helloRepository.save(hello);
	}

}
