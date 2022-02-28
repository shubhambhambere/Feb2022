package com.aspire.java.method;
import com.aspire.java.diffpackmethod.DiffpacknonstaticFriends;
public class Nonstaticsameclassfamily {
  public static void main(String[] args) {
	System.out.println("MAIN METHOD START");
	Nonstaticsameclassfamily SCobject=new Nonstaticsameclassfamily();
	SCobject.mother(); //Same Class
	SCobject.father(); //Same Class
	SCobject.brother();   //Same Class
	Nonstaicdiffclassrelative DCobject=new Nonstaicdiffclassrelative();
	DCobject.grandmother(); //Diff Class
	DCobject.uncle();       //Diff Class
	DCobject.uncle();       //Diff Class
	DiffpacknonstaticFriends DPobject=new DiffpacknonstaticFriends();
	DPobject.Degreefriends();  //Diff package
	DPobject.Diplomafriends(); //Diff package
	DPobject.Diplomafriends(); //Diff package
	System.out.println("MAIN METHOD END");
	
}
  public void mother()
  {
	  System.out.println("my mother name IS KALPANA");
  }
  public void father()
  {
	  System.out.println("My father Name is Parshuram");
  }

  public void brother()
  {
	  System.out.println("My father Name is soham");
  }
  
  
}
