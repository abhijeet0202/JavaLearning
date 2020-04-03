package Packages.p1;

public class Derived extends Protection{
	
	Derived(){
		System.out.println("Inside Derived Constructor");
		System.out.println("Inside Protection Constructor");
		
		System.out.println("Value of default_n:"+default_n);
		
		//BAse Class Private Members no Accessable
		//System.out.println("Value of pri_n:"+pri_n);
		
		System.out.println("Value of pro_n:"+pro_n);
		System.out.println("Value of pub_n:"+pub_n);
	}
}
