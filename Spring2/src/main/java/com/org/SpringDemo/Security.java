package com.org.SpringDemo;
import org.springframework.stereotype.Component;
@Component
public class Security implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Security - Guarding the gateway ....");
	}

	public Security() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
