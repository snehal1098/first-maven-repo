package com.lti.view;

import com.lti.model.Employee;

public class Empview {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpid(1001);
		emp.setEmpName("john");
		System.out.println("id: "+emp.getEmpid());
		System.out.println("name "+emp.getEmpName());
	}
	
}
