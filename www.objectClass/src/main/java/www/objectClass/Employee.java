package www.objectClass;

import java.io.*;

public class Employee {
	String name;
	int age;
	String designation;
	double salary;
	
	
	// creat constructor for Employee
	public Employee(String name){
		this.name = name;
	}
	
	public void empage(int empage){
		age = empage;
	}
	
	public void empdesignation(String empdesi){
		designation = empdesi;
	}
	
	public void empsalary(double empsalary){
		salary = empsalary;
		
	}
	
	/*public void Employeeinformation(){
		System.out.println("Employee Name\t :" +  name);
		System.out.println("Employee age\t :" +  age);
		System.out.println("Employee Designation\t :" + designation);
		System.out.println("Employee Salary\t :" +  salary);*/
		
}
	
	

