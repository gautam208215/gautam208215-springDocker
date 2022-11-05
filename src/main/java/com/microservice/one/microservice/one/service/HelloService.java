package com.microservice.one.microservice.one.service;

import java.util.List;

import com.microservice.one.microservice.one.entities.Hello;

public interface HelloService {

	List<Hello> getAllHelloDetails();

	Hello saveHelloDetails(Hello hello);
}
