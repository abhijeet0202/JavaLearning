package Lambda.Basic;

interface MyNumber {
	double getNumber();
}

interface SingleArgumentNumericTest {
	boolean test(int number);
}

interface DoubleArgumentNumericTest {
	boolean test(int number1, int number2);
}
public class BasicLambda {
	public static void main(String[] args) {
		
		//Example1
		MyNumber myNum;
		myNum = () -> 123.45;
		System.out.println("My get Number is : "+myNum.getNumber());
		
		//Example 2
		myNum = () -> Math.random() * 100;
		System.out.println("My get Number is : "+myNum.getNumber());
		
		//Example 3 // Error : A lambda expression must be compatible with the
		// method defined in Functional Interface
		//myNum = () -> "123.45";

		//Example 4
		SingleArgumentNumericTest numericTest;
		numericTest = (a) -> (a % 2 )==0;
		System.out.println("Is my Number Even : "+numericTest.test(10));
		System.out.println("Is my Number Even : "+numericTest.test(9));
		
		//Example 5
		numericTest = (a) -> a >= 0;
		System.out.println("Is my Number Non-Negative : "+numericTest.test(10));
		System.out.println("Is my Number Non-Negative  : "+numericTest.test(-9));
		
		DoubleArgumentNumericTest doubleArgumentNumericTest;
		doubleArgumentNumericTest = (a, b) -> (a % b) == 0;
		
		System.out.println("Is my Number2 factor of Number1  : "+doubleArgumentNumericTest.test(20,10));
		System.out.println("Is my Number2 factor of Number1  : "+doubleArgumentNumericTest.test(3,20));
		
	}

}
