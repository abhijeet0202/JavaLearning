package MultiThreading.Lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class LockUnlockDemo implements Runnable{
	final ReentrantLock reentrantLock = new ReentrantLock();

	@Override
	public void run() {
		reentrantLock.lock();
		try {
			System.out.println(Thread.currentThread().getName() + ": Lock acquired.");
			System.out.println("Processing...");
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println(Thread.currentThread().getName() + ": Lock released.");
			reentrantLock.unlock();
		}
	}
	public static void main(String[] args) {
		final int threadCount = 7;
		final ExecutorService service = Executors.newFixedThreadPool(threadCount);
		final LockUnlockDemo task = new LockUnlockDemo();
		for (int i=0; i< threadCount; i++) {
			service.execute(task);
		}
		service.shutdown();
	}

	
}