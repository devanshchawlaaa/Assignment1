package com.org.setterbasedDependence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.org.setterbasedDependence")
public class AppConfig {
	@Bean
	public Department getDepartment() {
		return new Departmentimpl();
	}
}
