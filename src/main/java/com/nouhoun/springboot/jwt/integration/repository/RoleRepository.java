package com.nouhoun.springboot.jwt.integration.repository;

import com.nouhoun.springboot.jwt.integration.domain.Role;
import org.springframework.data.repository.CrudRepository;

 
public interface RoleRepository extends CrudRepository<Role, Long> {
}
