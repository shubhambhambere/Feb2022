package com.aspire.java.method;
// import package location.classname
import com.aspire.java.diffpackmethod.DiffpackstaticFriends;

public class Staticsameclassfamily {
public static void main(String[] args) {
	System.out.println("main method start");
	mother(); //same class
	father();  //same class
	brother() ;  //same class
	StaticDiffclassrelative.uncle();          //Diff Class
	StaticDiffclassrelative.grandmother();   //Diff Class
	StaticDiffclassrelative.Cousine();   //Diff Class
	StaticDiffclassrelative.uncle();     //Diff Class
	DiffpackstaticFriends.DiplomaFriends();    //Diff Package
	DiffpackstaticFriends.Degreefriends();      //Diff Package
	DiffpackstaticFriends.DiplomaFriends();      //Diff Package	
	
	System.out.println("main method end");
}
public static void mother()
{
	System.out.println("my mother name kalpana");
}
public static void father()
{
	System.out.println("My father name parshuram");
	
}
public static void brother()
{
	System.out.println("My brother name Soham");
}
}
