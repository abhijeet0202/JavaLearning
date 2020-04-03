package MultiThreading.Lock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class TryLockDemo implements Runnable {
	final ReentrantLock reentrantLock = new ReentrantLock();
	
	@Override
	public void run() {
		try {
			boolean flag = reentrantLock.tryLock(10000, TimeUnit.MILLISECONDS);
			if (flag) {
				try {
					System.out.println(Thread.currentThread().getName() + ": Lock acquired.");
					System.out.println("Processing...");
					Thread.sleep(2000);
				} finally {
					System.out.println(Thread.currentThread().getName() + ": Lock released.");
					reentrantLock.unlock();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		final int threadCount = 5;
		final ExecutorService service = Executors.newFixedThreadPool(threadCount);
		final TryLockDemo task = new TryLockDemo();
		for (int i = 0; i < threadCount; i++) {
			service.execute(task);
		}
		service.shutdown();
	}

}
