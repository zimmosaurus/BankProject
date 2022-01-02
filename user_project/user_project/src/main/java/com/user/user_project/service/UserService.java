package com.user.user_project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.user.user_project.model.Users;
import com.user.user_project.repo.UserRepositoryService;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class UserService {
	
	@Autowired
	UserRepositoryService userRepoService;
	
	BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
	
	public List<Users> getList(){
		return userRepoService.findAll();
	}
	
	public Users addUser(Users user) {
		String encryptPassword = encoder.encode(user.getPassword());
		user.setPassword(encryptPassword);
		return userRepoService.save(user);
	}
}
