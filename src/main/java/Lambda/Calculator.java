package Lambda;

import java.util.function.IntBinaryOperator;

public class Calculator {

	/*interface IntegerMath {
		int operation(int a, int b);
	}*/

	/*public int operateBinary(int a, int b, IntegerMath op) {
		return op.operation(a, b);
	}*/
	
	public int operateBinary(int a, int b, IntBinaryOperator op) {
	return op.applyAsInt(a, b);
}

	public static void main(String... args) {
    
        Calculator myApp = new Calculator();
        //IntegerMath addition = (a, b) -> a + b;
       // IntegerMath addition = 
        IntBinaryOperator subtraction = (a, b) -> a - b;
        System.out.println("40 + 2 = " +
            myApp.operateBinary(40, 2, 
            		new IntBinaryOperator(){
							public int applyAsInt(int a, int b){
								return a+b;
							}
            		}
            ));
        System.out.println("20 - 10 = " +
            myApp.operateBinary(20, 10, subtraction));    
    }
}
