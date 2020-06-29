package com.karunesh.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.karunesh.aopdemo.dao.AccountDao;
import com.karunesh.aopdemo.dao.MembershipDao;

public class mainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDao accountDao = context.getBean("accountDao",AccountDao.class);
		
		MembershipDao membershipDao = context.getBean("membershipDao", MembershipDao.class);
		
		accountDao.addAccount(new Account("Madhu","2"), true);
		
		accountDao.dowork();
		
		
		accountDao.setAccountName("name");
		accountDao.setServiceCode("name");
		accountDao.getAccountName();
		accountDao.getServiceCode();
		
		
		
		membershipDao.addAccount();
		
		membershipDao.gotToSleep();
		
		
		context.close();
		

	}

}
