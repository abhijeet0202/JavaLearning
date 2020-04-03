package MultiThreading.Basics;

class ThreadClass implements Runnable{
	int i;
	boolean isSuspend;
	String name;
	Thread t;

	ThreadClass(String threadName){
		name = threadName;
		isSuspend = false;
		t= new Thread(this, name);
		t.start();
	}
	public void run(){
		System.out.println(Thread.currentThread());
		try{
			for (int i = 15; i < 0 ;i--){
				Thread.sleep(100);
				synchronized (this) {
					while(isSuspend){
						wait();
					}
				}
			}
		}catch(InterruptedException ex){
			System.out.println("Caught Interupt");
		}
	}
	void mysuspend() {
		isSuspend = true;
	}
	synchronized void myresume() {
		isSuspend = false;
		notify();
	}
}
public class SuspendResume_04 {

	public static void main(String[] args) {
		ThreadClass ob1 = new ThreadClass("One");
		ThreadClass ob2 = new ThreadClass("Two");
		try {
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Suspending thread One");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Resuming thread One");
			ob2.mysuspend();
			System.out.println("Suspending thread Two");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("Resuming thread Two");
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		// wait for threads to finish
		try {
			System.out.println("Waiting for threads to finish.");
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}

}
