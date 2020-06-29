package com.karunesh.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(3)
public class MyApiAnalyticsAspect {
	
	 @Before("com.karunesh.aopdemo.aspect.AopExpression.forDaoPackageNoGetterSetter()")
	 public void performApiAnalystics() {
	 	System.out.println("\n=======>> Exceuting API Analytics");
	 }

}
