package com.data.employee_payroll_jdbc;

public class EmployeePayrollException extends Exception {

	private String message;

	public EmployeePayrollException(String message) {
		this.message = message;
	}
}
