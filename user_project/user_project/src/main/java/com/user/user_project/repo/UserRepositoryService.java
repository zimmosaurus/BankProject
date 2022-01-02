package com.user.user_project.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.user_project.model.Users;

@Repository
public interface UserRepositoryService extends JpaRepository<Users, Integer>{
	Optional<Users> findByUsername(String username);
	

}
