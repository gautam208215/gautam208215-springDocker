package com.microservice.one.microservice.one.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.microservice.one.microservice.one.entities.Hello;

@Repository
public interface HelloRepository extends JpaRepository<Hello, Integer> {

}
