package com.nehajha.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nehajha.entity.User;
import com.nehajha.repository.UserRepository;

public class UserService {
	@Autowired
      private UserRepository repo;
	
	public List<User> getUsers(){
		return repo.findAll();
	}
	
	public User addUser(User user) {
		return repo.save(user);
	}
}
