package com.cognizant.tax;

public class EmployeeTax {
public static void main(String[] args) {
	TaxCalculator c = new TaxCalculator();
	//test case:1 
	c.calculateTax(25000);
	c.deductTax();
	c.validateSalary();
//	output:
//		The tax of the Employee for the 25000.0 is 7500.0
//		The nett salary of the employee: 17500
//		The salary and citizenship eligiblity: false

	//test case:2
	c.calculateTax(125000);
	c.deductTax();
	c.validateSalary();
//	output:
//	The tax of the Employee for the 125000.0 is 37500.0
//	The nett salary of the employee: 87500
//	The salary and citizenship eligiblity: false

}
}
