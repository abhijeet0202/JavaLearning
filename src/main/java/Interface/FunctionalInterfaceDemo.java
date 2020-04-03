package Interface;

@FunctionalInterface
interface myRunnable1 {
	public abstract void myString();
	
}

@FunctionalInterface
interface myRunnable extends myRunnable1{
	public abstract void run();
	
	default void myString() {
		System.out.println("Abhijeet");
	}
	
	/*@Override
	default String toString() {
		System.out.println("AbhiRAb");
	}*/
	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		myRunnable myRunnableObj = ()->System.out.println("Rabeya");
		
		myRunnableObj.run();
		myRunnableObj.myString();

	}

}
