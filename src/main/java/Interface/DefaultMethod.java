package Interface;

interface test1{
	default void show() {
		System.out.println("Inside test1");
	}
	
	static void show1() {
		System.out.println("Inside show test1");
	}
}

interface test2{
	default void show() {
		System.out.println("Inside test2");
	}
	
	static void show1() {
		System.out.println("Inside show test2");
	}
}
public class DefaultMethod implements test1, test2{

	public static void main(String[] args) {
		test2.show1();
		test1.show1();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
				test1.super.show();
				
				test2.super.show();
	}

}
