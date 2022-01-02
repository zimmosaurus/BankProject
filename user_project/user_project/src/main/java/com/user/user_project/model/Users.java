package com.user.user_project.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.springframework.stereotype.Component;
import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity
@Table(name = "user_project")
@NoArgsConstructor
@Data
public class Users {
	
	@Id
	@SequenceGenerator(name="USER_GNR",sequenceName = "USER_SQR", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_GNR")
	private long id;
	private String username;
	private String email;
	private String password;
	
	public Users(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
	}

}
