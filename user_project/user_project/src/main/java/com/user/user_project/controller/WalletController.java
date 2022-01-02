package com.user.user_project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.user_project.constants.PathConstant;
import com.user.user_project.model.WalletAccount;
import com.user.user_project.service.WalletAccountService;

@RestController
@RequestMapping("/api/")
public class WalletController {
	
	@Autowired
	WalletAccountService walletAccountService;
	
	@GetMapping(path = PathConstant.ADD_AMOUNT_TO_WALLET)
	public ResponseEntity<?> addAmount(long val){
		//get current user
		WalletAccount resp = walletAccountService.addValue(val);
		return ResponseEntity.ok(resp);
	}	
	@GetMapping(path = PathConstant.DISPLAY_AMOUNT)
	public ResponseEntity<?> displayAmount(long val){
		WalletAccount resp = walletAccountService.displayValue(val);
		return ResponseEntity.ok(resp);
	}
	
}
