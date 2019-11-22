package com.nouhoun.springboot.jwt.integration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nouhoun.springboot.jwt.integration.domain.UserClientDetails;

public interface ClientDetailsRepo extends JpaRepository<UserClientDetails, Integer>{

	
	UserClientDetails findByClientId(String clientId);
}
