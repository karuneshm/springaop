package com.karunesh.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.karunesh.aopdemo.dao.AccountDao;
import com.karunesh.aopdemo.dao.MembershipDao;

public class AfterThrowingMainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDao accountDao = context.getBean("accountDao",AccountDao.class);
		
		List<Account> theAccounts = null;
		try {
			boolean tripWire = true;
			theAccounts = accountDao.findAccounts(tripWire);
		} catch(Exception e) {
			System.out.println("\n\n Main Program...Caught Exception "+ e);
		}
		
		
		System.out.println("\n\n Main Program: After Throwing");
		
		System.out.println("------");
		
		System.out.println(theAccounts);
		
		
		context.close();
		

	}

}
