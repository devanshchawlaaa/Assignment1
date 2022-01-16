package com.org.SpringDemo;
import org.springframework.stereotype.Component;

@Component
public class Administration implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Adminstration work is in progress");
	}

	public Administration() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
