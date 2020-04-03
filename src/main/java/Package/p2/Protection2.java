package Package.p2;

public class Protection2 extends Packages.p1.Protection{
	Protection2() {
		System.out.println("Inside Protection2 constructor");
				
		//No Right to access Default variable outside the package
		//System.out.println("Value of default_n:"+obj.default_n);
			
		//Private Members no Accessable within same package also
		//System.out.println("Value of pri_n:"+obj.pri_n);
			
		System.out.println("Inside Protection2 Value of pro_n:"+pro_n);
		System.out.println("Inside Protection2 Value of pub_n:"+pub_n);
	}
}
