package com.karunesh.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.karunesh.aopdemo.Account;

@Component
public class AccountDao {
	
	public void addAccount(Account theAccount,boolean vipFlag) {
		System.out.println(getClass() +" : Adding Account Dao");
	}
	
	
	public boolean dowork() {
		System.out.println(getClass() +" : dowork()");
		return true;
	}

}
