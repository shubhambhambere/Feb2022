package com.aspire.java.oops.remaininheritance;

public class MultiStudent extends MultiDepartment {

	public static void student()
	{
		System.out.println("In this Collage Total 500 Student");
	}
	
	public void studentDepartment()
	{
		System.out.println("In machanical There are 120 Students");
	}
	
	public static void main(String[] args) {
		
		Multicollage MC=new Multicollage ();
		Multicollage.collage();	
		MC.collageRules();
		
		MultiDepartment MD=new MultiDepartment();
MD.collageRules();
Multicollage.collage();
		MD.Department();
		MD.DepartmentName();
		
		MultiStudent MS=new MultiStudent();
		student();
		MS.studentDepartment();
		
		
	}
	
	
	
}
