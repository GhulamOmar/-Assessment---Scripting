package company.controller;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;

import company.beans.Department;
import company.beans.Employee;


@Configuration
public class BeanConfiguration {
	
	
	
	@Bean
	public Employee employee() {
		Employee bean = new Employee("Eric", "Carle");
		return bean;
	}

	@Bean
	public Department department() {
		Department bean = new Department("2000", "Production", "Sales manager");
		return bean;
	}
}



