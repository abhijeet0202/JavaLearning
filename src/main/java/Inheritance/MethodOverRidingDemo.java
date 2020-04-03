package Inheritance;

class Base{
	int memberVar;
	Base(){
		System.out.println("Inside Constructor::Base");
	}
	
	void print(){
		System.out.println("Inside Base::print");
	}
}

class Derived extends Base{
	int memberVar;
	Derived(){
		System.out.println("Inside Constructor::Derived");
	}
	
	void print(){
		System.out.println("Inside Derived::print");
		System.out.println("Derived::memberVar:"+memberVar);
		
		System.out.println("Base::memberVar:"+super.memberVar);
	}
}

public class MethodOverRidingDemo {
	public static void main(String[] args) {
		Derived derivedObj = new Derived();
		derivedObj.memberVar = 2;
		derivedObj.print();
	}
}
