package com.karunesh.aopdemo.dao;

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
	
	

}
