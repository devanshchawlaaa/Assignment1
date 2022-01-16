package com.org.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TechnicalWriter implements Writer {
	@Autowired
	Award a1;
	
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("Write technical stuff...");System.out.println();
	}

	
	public void getAward() {
		// TODO Auto-generated method stub

		a1.award();
	}

}
