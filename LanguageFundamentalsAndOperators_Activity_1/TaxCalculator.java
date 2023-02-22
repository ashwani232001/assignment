package com.cognizant.tax;

public class TaxCalculator {
float basicSalary,tax;
boolean citizenship;
int nettSalary;

void calculateTax(float basicSalary) {
	this.basicSalary=basicSalary;
	
	tax=30*basicSalary/100;
	System.out.println("The tax of the Employee for the "+basicSalary+" is "+tax);
}
void deductTax() {
 nettSalary=(int) (basicSalary-tax);
 System.out.println("The nett salary of the employee: "+nettSalary);
}
void validateSalary() {
	if(basicSalary > 100000) {
		System.out.println("The salary and citizenship eligiblity: true");
	}
	else {
		System.out.println("The salary and citizenship eligiblity: false");
	}
}
}
