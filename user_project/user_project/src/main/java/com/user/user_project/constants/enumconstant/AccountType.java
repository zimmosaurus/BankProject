package com.user.user_project.constants.enumconstant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum AccountType {
	CA("CA"),SA("SA"),LA("LA");
	
	@Getter
	String type;
}
