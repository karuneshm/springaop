package com.karunesh.aopdemo.dao;

import org.springframework.stereotype.Component;



@Component
public class MembershipDao {
	
	
	public void addAccount() {
		System.out.println(getClass() +" : Adding Membership Dao");
	}
	
	public boolean gotToSleep() {
		System.out.println(getClass() +" : gotToSleep()");
		return true;
	}

}
