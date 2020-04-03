package Inheritance;

public class OverloadingDemo {
	
	private static void print(Object o){
		System.out.println("Object");
	}
	
	private static void print(String str){
		System.out.println("String");
	}
	
	/*public void print(StringBuffer str){
		System.out.println("StringBuffer");
	}*/

	public static void main(String[] args) {
		OverloadingDemo demo = new OverloadingDemo();
		print(10);

	}

}
