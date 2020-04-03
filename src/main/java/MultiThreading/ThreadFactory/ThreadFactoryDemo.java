package MultiThreading.ThreadFactory;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

class Task implements Runnable {
	@Override
	public void run() {
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

class ThreadFactoryClass implements ThreadFactory {

	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r,"MyTHreadFactory");
	    return t;
	}

}

public class ThreadFactoryDemo {

	public static void main(String[] args) {
		ThreadFactoryClass threadFactoryClass = new ThreadFactoryClass();
		Task task = new Task();
		Thread thread = null;
		thread = threadFactoryClass.newThread(task);
		thread.start();
		System.out.println(thread.getName());
	}
}
