package MultiThreading.Lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

public class LockInterruptiblyDemo implements Runnable {
	final ReentrantLock reentrantLock = new ReentrantLock();
	
	@Override
	public void run() {
		try {
			reentrantLock.lockInterruptibly();
				try {
					System.out.println(Thread.currentThread().getName() + ": Lock acquired.");
					System.out.println("Processing...");
					Thread.sleep(5000);
				} finally {
					System.out.println(Thread.currentThread().getName() + ": Lock released.");
					reentrantLock.unlock();
				}
		} catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("Rabeya's Satisfaction");
		}
	}

	public static void main(String[] args) {
		final int threadCount = 5;
		final ExecutorService service = Executors.newFixedThreadPool(threadCount);
		final LockInterruptiblyDemo task = new LockInterruptiblyDemo();
		for (int i = 0; i < threadCount; i++) {
			service.execute(task);
		}
		service.shutdown();
	}

}
