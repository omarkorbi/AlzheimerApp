package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository													//Long
public interface UserRepository extends JpaRepository<User, String> {

	Optional<User> findByLogin(String login);
	Optional<User> deleteByLogin(String login);
	
	
	
	
	
}
