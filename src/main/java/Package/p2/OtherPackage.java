package Package.p2;

import Packages.p1.Protection;

public class OtherPackage {
		OtherPackage(){
		
		Protection obj = new Protection();
		System.out.println("Inside Derived Constructor");
		System.out.println("Inside Protection Constructor");
		
		//No Right to access Default variable outside the package
		//System.out.println("Value of default_n:"+obj.default_n);
		
		//Private Members no Accessable within same package also
		//System.out.println("Value of pri_n:"+obj.pri_n);
		
		//protected members can be accessed outside package, only if this class was inherited from source package
		//System.out.println("Value of pro_n:"+obj.pro_n);
		
		System.out.println("Value of pub_n:"+obj.pub_n);
	}

}
