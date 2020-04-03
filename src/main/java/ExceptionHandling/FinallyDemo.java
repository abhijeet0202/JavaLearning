package ExceptionHandling;

public class FinallyDemo {
	
	//Through an exception out of the method
	static void functionOne(){
		try{
			System.out.println("Inside functionOne");
			throw new RuntimeException("FunctionOne");
		} finally {
			System.out.println("Finally Block of functionOne");
		}
	}

	//Return from Within a try block.
	static void functionTwo(){
		try{
			System.out.println("Inside functionTwo");
			return;
		} finally {
			System.out.println("Finally Block of functiontwo");
		}
	}
	//Return from Within a try block.
	static void functionThree(){
		try{
			System.out.println("Inside functionThree");
		} finally {
			System.out.println("Finally Block of functionThree");
		}
	}
	public static void main(String[] args) {
		try {
			functionOne();
		} catch (RuntimeException ex){
			System.out.println(ex);
		}
		functionTwo();
		functionThree();

	}

}
