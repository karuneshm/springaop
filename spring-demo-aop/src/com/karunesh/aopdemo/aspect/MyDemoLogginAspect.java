package com.karunesh.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class MyDemoLogginAspect {
	
	//@Before("execution(public void com.karunesh.aopdemo.dao.AccountDAO.addAccount())")
	//@Before("execution(public void addAccount())")
	//@Before("execution(public void com.karunesh.aopdemo.dao.AccountDao.addAccount())")
	public void beforeAddAccountAdvice() {
		System.out.println("\n======>>> Executing @before Advice method add acoount");
	}
	
	//@Before("execution(public void add*())")
	public void beforeAddAccountAdviceForAdd() {
		System.out.println("\n======>>> Executing @before Advice on Account");
	}
	
	@Before("execution(* com.karunesh.aopdemo.dao.*.*(..))")
	public void beforeAddAccountAdviceReturnType() {
		System.out.println("\n======>>> Executing @before Advice on Account");
	}
	
	
	
	

}
