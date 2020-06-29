package com.karunesh.aopdemo;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.karunesh.aopdemo.service.TrafficFortuneService;

public class AroundHandleExceptionMainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService trafficFortuneService = 
				context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		System.out.println("Main Program : Around");
		System.out.println("Calling Fortune");
		boolean tripWire = true;
		System.out.println(trafficFortuneService.getFortune(tripWire));
		System.out.println("Finished");
	
		context.close();
		

	}

}
