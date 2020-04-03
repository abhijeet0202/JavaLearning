package ExceptionHandling;

public class ThrowsDemo {

	public static void main(String[] args) {
		try{
			throwsFunc();
		}
		catch (NullPointerException ex){
			System.out.println("NullPointerException");
		}
		catch (IllegalAccessException ex){
			System.out.println("IllegalAccessException");
		}
		catch (ArithmeticException ex){
			System.out.println("ArithmeticException");
		}
		
	}
	
	 static void throwsFunc() throws IllegalAccessException,NullPointerException,ArithmeticException {
		System.out.println("Inside throwsFunc");
		throw new ArithmeticException();
	}

}
