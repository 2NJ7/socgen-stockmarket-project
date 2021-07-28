package com.nehajha.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nehajha.entity.User;

public interface UserRepository extends JpaRepository<User,String>{
	public User findByUsername(String username);
	public User findByUsernameOrEmail(String username, String email);
	public User findByConfirmationToken(String token);
}
