package MultiThreading.Concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable<Integer> {

	@Override
	public Integer call() {
		System.out.println("Current Thread: " + Thread.currentThread().getName());
		return 123;
	}

}

public class IntroCallable {
	public static void main(String[] args) {

		FutureTask<Integer> task = new FutureTask<Integer>(new MyCallable());
		ExecutorService pool = Executors.newSingleThreadExecutor();
		pool.submit(task);

		try {
			System.out.println("Value returned from Thread : " + task.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		pool.shutdown();
	}
}
