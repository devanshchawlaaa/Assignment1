package com.org.auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.auto.AppConfig;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Writer w = con.getBean(FictionWriter.class);
		
		w.write();
		w.getAward();
		con.close();
		
		
		
	}

}
