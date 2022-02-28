package com.aspire.java.oops.inheritance;

public class TestSingle2 {
	public static void main(String[] args) {
		
		AnimalSingleInheritance ASI=new AnimalSingleInheritance();
		ASI.eating();
		AnimalSingleInheritance.running();
		
		
		DogSingleInheritance DSI=new DogSingleInheritance();
		DSI.eating();
		DSI.loyal();
		DogSingleInheritance.barking();
		DogSingleInheritance.running();
		
		
		
	}

}
