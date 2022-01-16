package com.org.copy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FictionWriter implements Writer {
	@Autowired
	  Award award;
	
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("write fictional stuff...");
	}

	public void getAward() {
		// TODO Auto-generated method stub
		award.award();
	}

}
