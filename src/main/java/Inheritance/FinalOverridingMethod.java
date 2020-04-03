package Inheritance;

abstract class  Base1{
	
	Base1() {
		System.out.println("Inside Base1 Constructor");
	}
	
	 final void printme() {
		System.out.println("Inside Base1 printme");
	}
}

class Derved1 extends Base1{
	
	Derved1() {
		System.out.println("Inside Derved1 Constructor");
	}
	/*
	 * (non-Javadoc)
	 * @see Cannot override the final method from Base1 - overrides Inheritance.Base1.printme
	 */
	 /*final void printme() {
		System.out.println("Inside Derved1 Constructor");
	}*/
}

public class FinalOverridingMethod {

	public static void main(String[] args) {
		Base1 baseObj = new Derved1();
		baseObj.printme();
		
	}

}
