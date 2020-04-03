package Lambda.BlockExpression;

interface Factorial {
	int facto(int fact);
}

public class FactorialRecurrsion {

	public static void main(String[] args) {
		Factorial factorial = (int fact) -> {
			int result =1;
			for (int i =1; i<=fact; i++) {
				result = i *result; 
			}
			return result;
		};
		
		System.out.println("Factorial of 6 is :"+ factorial.facto(6));
	}
}
