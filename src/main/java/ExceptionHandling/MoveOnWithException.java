package ExceptionHandling;

import java.util.Random;

//Handle and exception and move on
public class MoveOnWithException {

	public static void main(String[] args) {
		int a=0, b=0,c =0;
		
		Random rand = new Random();
		
		for (int i = 0; i <32000; i++){
			try{
				b = rand.nextInt();
				c = rand.nextInt();
				a = 12345/(b/c);
			} catch (ArithmeticException exp) {
				System.out.println("Division By Zero: "+exp);
				a =0; //Set a equal Zero
			}
			System.out.println("Abhijeet's a::"+a);
		}
	}
}
