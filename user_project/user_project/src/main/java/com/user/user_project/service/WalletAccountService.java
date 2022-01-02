package com.user.user_project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.user_project.model.Users;
import com.user.user_project.model.WalletAccount;
import com.user.user_project.repo.WalletAccountRepo;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@Service
public class WalletAccountService {
	
	@Autowired
	WalletAccountRepo walletAccountRepo;
	
	public WalletAccount addValue(long value) {
		Users currUser = null;
		WalletAccount wallet = null;
		Optional<WalletAccount> optWallet = walletAccountRepo.findByAccNum(value);
		if(optWallet.isPresent()) {
			wallet = optWallet.get();
			wallet.setTotalAmt(value + wallet.getTotalAmt());
		}
		return walletAccountRepo.save(wallet);	
	}
	
	public WalletAccount displayValue(long value) {
		Users currUser = null;
		Optional<WalletAccount> optWallet = walletAccountRepo.findByAccNum(value);
		if(optWallet.isPresent())
			return optWallet.get();
		return null;
	}
}
