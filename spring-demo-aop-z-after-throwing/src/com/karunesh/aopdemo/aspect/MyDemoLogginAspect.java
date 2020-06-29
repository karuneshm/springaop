package com.karunesh.aopdemo.aspect;


import java.lang.reflect.Method;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.karunesh.aopdemo.Account;


@Aspect
@Component
@Order(3)
public class MyDemoLogginAspect {

	
	@AfterThrowing(pointcut = "execution(* com.karunesh.aopdemo.dao.AccountDao.findAccounts(..))",
			throwing = "theExc")
	public void afterThrowingFindAccountsAdvice(JoinPoint theJoinPoint, 
			Throwable theExc) {
		
		String method = theJoinPoint.getSignature().toShortString();
		
		System.out.println("\n====>> Exceuting After Throwinfg on method : " +method);
		
		System.out.println("\n====>> the Exception is : " +theExc);
		
	}
	
	
	
	@AfterReturning(pointcut = "execution(* com.karunesh.aopdemo.dao.AccountDao.findAccounts(..))",returning ="result")
	public void afterReturningFindAccountAdvice(JoinPoint theJoinPoint, List<Account> result) {
		
		String method = theJoinPoint.getSignature().toShortString();
		
		System.out.println("\n====>> Exceuting After retuning on method : " +method);
		
//		if(result !=null) {
//			Account temp = result.get(0);
//			temp.setName("temp");
//		}
		
		
		System.out.println("\n======>> Result is "+ result);
		
	}
	
	@Before("com.karunesh.aopdemo.aspect.AopExpression.forDaoPackageNoGetterSetter()")
	public void beforeAddAccountAdviceReturnType(JoinPoint joinPoint) {
		System.out.println("\n======>>> Executing @before Advice on Account");
		
		MethodSignature methodSig= (MethodSignature) joinPoint.getSignature();
		
		System.out.println("Method: "+ methodSig);
		
		Object[] args = joinPoint.getArgs();
		
		for(Object arg : args) {
			System.out.println(arg);
		}
		
	}
	
  
   
  
   
   
	
	
	
	

}
