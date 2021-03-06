package com.user.user_project.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.user_project.model.Users;
import com.user.user_project.model.WalletAccount;

@Repository
public interface WalletAccountRepo extends JpaRepository<WalletAccount, Integer>{
	Optional<WalletAccount> findByAccNum(long accNum);
	List<WalletAccount> findByUserAcc(Users userAcc);

}
