package com.nehajha.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nehajha.entity.User;
import com.nehajha.services.UserService;

@RequestMapping("/user")
public class UserController {
	UserService userservice;
	@GetMapping("/getuser")
	public ResponseEntity<List<User>> getUser(){
		return ResponseEntity.ok(userservice.getUsers());
	}
	@PostMapping("/adduser")
	public ResponseEntity<User> addStockExchange(@RequestBody User user){
		return ResponseEntity.ok(userservice.addUser(user));
	}

}
