package com.aspire.java.conditionalstatement;

public class Elseif3 {public static void main(String[] args) {
	System.out.println("Program start");
	int age=50;
	if(age>90)
	{
		System.out.println("Expired RIP");
	}
	else if(age>=70)
	{System.out.println("Old Man");
		
	}
	else if(age>=40)
	{
		System.out.println("Matured man");
	}
	else if(age>=25)
	{
		System.out.println("Young man");
	}
	else if (age>=10)
	{
		System.out.println("Child");
	}
	else
	{
		System.out.println("Baby child");
	}
	System.out.println("Program end");
}

}
