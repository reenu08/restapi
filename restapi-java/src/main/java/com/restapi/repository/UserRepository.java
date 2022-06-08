package com.restapi.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

import com.restapi.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}