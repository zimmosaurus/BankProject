package com.user.user_project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.user_project.constants.PathConstant;
import com.user.user_project.model.Users;
import com.user.user_project.service.UserService;

@RestController
@RequestMapping("/api/")
public class MainController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping(path = PathConstant.LIST_USERS)
	public ResponseEntity<?> getList(){
		List<Users> listOfUsers = userService.getList();
		return ResponseEntity.ok(listOfUsers);
	}
	
	@PostMapping(path = PathConstant.ADD_USER)
	public ResponseEntity<?> addUser(@RequestBody Users user){
		Users resp = userService.addUser(user);
		return ResponseEntity.ok(resp);
	}
	

}
