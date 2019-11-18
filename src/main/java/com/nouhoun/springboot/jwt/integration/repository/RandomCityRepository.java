package com.nouhoun.springboot.jwt.integration.repository;

import com.nouhoun.springboot.jwt.integration.domain.RandomCity;
import org.springframework.data.repository.CrudRepository;

 
public interface RandomCityRepository extends CrudRepository<RandomCity, Long> {
}
