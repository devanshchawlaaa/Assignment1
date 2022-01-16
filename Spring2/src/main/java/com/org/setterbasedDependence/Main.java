package com.org.setterbasedDependence;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext con = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Company c = con.getBean(Company.class);
		
		c.showDepartmentInfo();
		con.close();
		
	}

}
