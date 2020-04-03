package Lambda.Generic;

interface GenericExecution<T>{
	T execute(T t);
}
public class Execution {

	public static void main(String[] args) {
		GenericExecution<Integer> execution = (t) ->{
			int result =1;
			for (int i =1; i<=t; i++) {
				result = i *result; 
			}
			return result;
		};
		System.out.println("Factorial of 6 is :"+ execution.execute(6));
	
	GenericExecution<String> strexecution = (str) ->{
		String result = "";
		for (int i = str.length()-1; i>=0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	};
	System.out.println("Factorial of 6 is :"+ strexecution.execute("abhijeet"));
}

}
