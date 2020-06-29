package com.karunesh.aopdemo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.karunesh.aopdemo.Account;

@Component
public class AccountDao {
	
	private String accountName;
	
	private String serviceCode;
	
	public void addAccount(Account theAccount,boolean vipFlag) {
		System.out.println(getClass() +" : Adding Account Dao");
	}
	
	
	public boolean dowork() {
		System.out.println(getClass() +" : dowork()");
		return true;
	}


	public String getAccountName() {
		System.out.println(getClass() +" : getAccountName()");
		return accountName;
	}


	public void setAccountName(String accountName) {
		System.out.println(getClass() +" : setAccountName()");
		this.accountName = accountName;
	}


	public String getServiceCode() {
		System.out.println(getClass() +" : getServiceCode()");
		return serviceCode;
	}


	public void setServiceCode(String serviceCode) {
		System.out.println(getClass() +" : setServiceCode()");
		this.serviceCode = serviceCode;
	}
	
	public List<Account> findAccounts() {
		
		List<Account> myAccounts = new ArrayList<Account>();
		
		Account temp1 = new Account("John","Silver");
		Account temp2 = new Account("madhu","Platinum");
		Account temp3 = new Account("Luca","Silver");
		
		myAccounts.add(temp1);
		myAccounts.add(temp2);
		myAccounts.add(temp3);
		
		
		return myAccounts;
		
	}

}
