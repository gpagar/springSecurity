package com.nouhoun.springboot.jwt.integration.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Component;
@Component
public class SureSellClientDetailsService implements ClientDetailsService{

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
		
	
				// Call Database JPA
		String resourceIds="testjwtresourceid";
		 
		String scopes="read,write";
		String grantTypes="password";
		String authorities=null;
		 Map<String, Object> additionalInformation = new HashMap<>();
		// additionalInformation.put("subLevel1", 1);
			 
		 ClientDetailsImpl baseClientDetails=new ClientDetailsImpl(clientId, resourceIds, scopes, grantTypes, authorities,additionalInformation);
		
		
		
		
		baseClientDetails.setClientSecret(passwordEncoder.encode("XY7kmzoNzl101"));
		
		System.out.println("&&&&&& "+baseClientDetails.toString());
		
		return baseClientDetails;
	}

	 

}
