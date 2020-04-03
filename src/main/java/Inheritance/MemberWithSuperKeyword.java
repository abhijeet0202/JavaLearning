package Inheritance;

class Superclass1
{
	/*private*/ int i;
	
	
	Superclass1(/*int temp*/) {
		i=1;
		System.out.println("Superclass1 Constructor");
	}
	
	void print(){
		System.out.println("Superclass1 print:"+i);
	}
}

class Subclass1 extends Superclass1{
	
	int i;
	
	
	Subclass1(){
		i=2;
		System.out.println("Subclass1 Constructor");
	}
	void print(){
		super.print();
		System.out.println("Subclass1 print:"+i);
		System.out.println("Superclass1 print:"+super.i);
	}
}
public class MemberWithSuperKeyword {

	public static void main(String[] args) {
		Subclass1 subclassObj = new Subclass1();
		subclassObj.print();

	}

}
