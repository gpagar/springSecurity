package com.nouhoun.springboot.jwt.integration.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;
import org.springframework.stereotype.Component;

import com.nouhoun.springboot.jwt.integration.domain.UserClientDetails;
import com.nouhoun.springboot.jwt.integration.repository.ClientDetailsRepo;

@Component
public class SureSellClientDetailsService implements ClientDetailsService {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private ClientDetailsRepo clientDetailsRepo;

	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {

		// Call Database JPA
		UserClientDetails userClientDetails = clientDetailsRepo.findByClientId(clientId);

		if (userClientDetails == null) {
			throw new UsernameNotFoundException(String.format("The Client Id %s doesn't exist", clientId));

		}

		BaseClientDetails baseClientDetails = new BaseClientDetails(clientId, userClientDetails.getResourceIds(),
				userClientDetails.getScopes(), "password", userClientDetails.getAuthorities());
		baseClientDetails.setAccessTokenValiditySeconds(userClientDetails.getAccessTokenValiditySeconds());
		baseClientDetails.setClientSecret(passwordEncoder.encode(userClientDetails.getClientSecret()));

		return baseClientDetails;
	}

}
