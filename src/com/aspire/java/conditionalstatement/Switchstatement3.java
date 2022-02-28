package com.aspire.java.conditionalstatement;
//Banking=cash withrawal,money transfer,fund transfer
public class Switchstatement3 {public static void main(String[] args) {
	String input="CW";
	switch (input)
	{case "CW":
		System.out.println("cash withrawal");
		break;
	case "FT":
		System.out.println("Fund transfer");
	  break;
	default:
		System.out.println("Invalid input");
		break;
	}
}

}
