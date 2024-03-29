package com.karunesh.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class MyCloudLogAsyncAspect {
	
	@Before("com.karunesh.aopdemo.aspect.AopExpression.forDaoPackageNoGetterSetter()")
	public void logToCloudAsync() {
		System.out.println("\n=======>> Logging to cloud in async fashion");
	}

}
