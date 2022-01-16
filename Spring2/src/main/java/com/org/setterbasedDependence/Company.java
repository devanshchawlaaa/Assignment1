package com.org.setterbasedDependence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Company implements Department {

	private Department dept;

	@Autowired
	public void setDept(Department dept) {
		this.dept = dept;
	}


	public void showDepartmentInfo() {
		// TODO Auto-generated method stub
		dept.showDepartmentInfo();
	}
	
	
}
