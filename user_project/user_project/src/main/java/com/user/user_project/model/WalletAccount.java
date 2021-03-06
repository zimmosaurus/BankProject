package com.user.user_project.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import com.user.user_project.constants.enumconstant.AccountType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Component
@Entity(name = "WALLETACCOUNT")
@NoArgsConstructor
@Data
public class WalletAccount{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	@Enumerated(EnumType.STRING)
	private AccountType accountType;
	@Column
	private long totalAmt;
	@Column
	private transient Users userAcc;
	@Column
	private Boolean bankrupt;
	@Column
	private Long accNum;
	
	public WalletAccount(AccountType accountType, long totalAmt, Users user, boolean bankrupt,long accNum) {
		this.accountType = accountType;
		this.totalAmt = totalAmt;
		this.userAcc = user;
		this.bankrupt = bankrupt;
		this.accNum = accNum;
	}
	
}
