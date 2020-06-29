package com.karunesh.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.karunesh.aopdemo.dao.AccountDao;
import com.karunesh.aopdemo.dao.MembershipDao;

public class AfterReturningMainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		AccountDao accountDao = context.getBean("accountDao",AccountDao.class);
		
		List<Account> theAccounts = accountDao.findAccounts(false);
		
		System.out.println("\n\n Main Program: After Returning");
		
		System.out.println("------");
		
		System.out.println(theAccounts);
		
		
		context.close();
		

	}

}
