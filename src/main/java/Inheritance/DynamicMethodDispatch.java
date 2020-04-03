package Inheritance;

class GrandFather{
	int i = 3;
	
	GrandFather(){
		System.out.println("Inside Grandfather Constructor");
		//System.out.println();
	}
	
	void print()
	{
		System.out.println("Inside Grandfather print");
		System.out.println();
	}
}

class Father1 extends GrandFather{
	
	int i =4;
	
	Father1(){
		System.out.println("Inside father1 Constructor");
		System.out.println();
	}
	
	void print()
	{
		System.out.println("Inside father1 print");
		System.out.println();
	}
}

class Father2 extends GrandFather{
	
	int i =7;
	Father2(){
		System.out.println("Inside father2 Constructor");
		System.out.println();
	}
	
	void print()
	{
		System.out.println("Inside father2 print");
		System.out.println();
	}
}
public class DynamicMethodDispatch {

	public static void main(String[] args) {
		GrandFather grandFatherObj = new GrandFather();
		Father1 Father1Obj = new Father1();
		Father2 Father2Obj = new Father2();
		
		GrandFather grandFatherObjtemp;
		
		grandFatherObjtemp = grandFatherObj;
		grandFatherObjtemp.print();
		//Need to find answer
		System.out.println("i= "+grandFatherObjtemp.i);
		
		grandFatherObjtemp = Father1Obj;
		grandFatherObjtemp.print();
		//Need to find answer
		System.out.println("i= "+grandFatherObjtemp.i);
		
		grandFatherObjtemp = Father2Obj;
		grandFatherObjtemp.print();
		System.out.println("i= "+grandFatherObjtemp.i);
	}

}
