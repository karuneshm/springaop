package com.karunesh.aopdemo;



import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.karunesh.aopdemo.service.TrafficFortuneService;

public class AroundMainApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
		
		TrafficFortuneService trafficFortuneService = 
				context.getBean("trafficFortuneService",TrafficFortuneService.class);
		
		System.out.println("\n Main Program : Around");
		System.out.println("Calling Fortune");
		System.out.println(trafficFortuneService.getFortune());
		System.out.println("Finished");
	
		context.close();
		

	}

}
