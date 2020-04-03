package MultiThreading.Basics;

public final class AnonymousThreadClass {

	public static void main(String[] args) {

		Thread obj = new Thread(new Runnable() {
			public void run() {
				System.out.println("I am Inside run Thread");
			}
		});
		
		obj.start();
	}
}