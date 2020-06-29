package com.karunesh.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(3)
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
	
	@Before("com.karunesh.aopdemo.aspect.AopExpression.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdviceReturnType() {
		System.out.println("\n======>>> Executing @before Advice on Account");
	}
	
  
   
  
   
   
	
	
	
	

}
