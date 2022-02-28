package com.aspire.java.oops.Abstract;

public class Test1 {
public static void main(String[] args) {
	Child1 c1=new Child1();
	
	c1.Chrome();   //This is concrete method here decleration & Defination
	c1.Url();      //this is Abstract method call by child1 object
	c1.Login();
	c1.UserName();
	c1.Password();
	c1.SigninButton();
	c1.ShoopingAddtoCart();
	c1.Payment();    
	c1.Logout();
	
	Child2 c2=new Child2();
	c2.Chrome();
	c2.Url();
	c2.Login();
	c2.UserName();
	c2.Password();
c2.SigninButton();
c2.ShoopingAddtoCart();
c2.Payment();
c2.Logout();

   Child3 c3=new Child3();
   c3.Chrome();
   c3.Url();
   c3.Login();
  c3.UserName();
  c3.Password();
  c3.SigninButton();
  c3.ShoopingAddtoCart();
  c3.Payment();
  c3.Logout();



}
}
