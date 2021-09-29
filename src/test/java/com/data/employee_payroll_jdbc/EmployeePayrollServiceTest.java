package com.data.employee_payroll_jdbc;

import org.junit.Test;

public class EmployeePayrollServiceTest {

	@Test
	public void givenEmployeePayrollDatabase_ShouldConnectToDatabase() {
		EmployeePayrollService employeePayrollService = new EmployeePayrollService();
		employeePayrollService.checkDatabaseConnection();
	}
}
