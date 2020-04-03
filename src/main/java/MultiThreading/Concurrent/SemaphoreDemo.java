package MultiThreading.Concurrent;

import java.util.concurrent.Semaphore;

class SharedResources{
	public static int i;
}
public class SemaphoreDemo {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(2, true);
		
		new Thread(new SemaphoreIncrement(semaphore,"Thread1")).start();
		new Thread(new SemaphoreIncrement(semaphore,"Thread2")).start();
		new Thread(new SemaphoreIncrement(semaphore,"Thread3")).start();
		new Thread(new SemaphoreIncrement(semaphore,"Thread4")).start();

	}

}

class SemaphoreIncrement implements Runnable{
	Semaphore mySemaphore;
	String ThreadName;
	
	public SemaphoreIncrement(Semaphore tSemaphore, String tThreadName) {
		mySemaphore = tSemaphore;
		ThreadName = tThreadName;
	}
	public void run() {
		try {
			System.out.println("Waiting to access shared resouce :"+ ThreadName);
			mySemaphore.acquire();
			System.out.println("Got Access :"+ ThreadName);
			
			SharedResources.i++;
			Thread.sleep(5000);
			
			mySemaphore.release();
			System.out.println("Released shared resouce :"+ ThreadName);
		}catch(InterruptedException ex) {
			ex.getMessage();
		}
	}
}
