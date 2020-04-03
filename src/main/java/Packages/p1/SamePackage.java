package Packages.p1;

public class SamePackage {

	SamePackage(){
		
		Protection obj = new Protection();
		System.out.println("Inside Derived Constructor");
		System.out.println("Inside Protection Constructor");
		
		System.out.println("Value of default_n:"+obj.default_n);
		
		//Private Members no Accessable within same package also
		//System.out.println("Value of pri_n:"+obj.pri_n);
		
		System.out.println("Value of pro_n:"+obj.pro_n);
		System.out.println("Value of pub_n:"+obj.pub_n);
	}
}
