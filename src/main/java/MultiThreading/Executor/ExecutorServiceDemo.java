package MultiThreading.Executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class ImplementRun implements Runnable{
	
	@Override
	public void run(){
		
		for (int i =0; i <5 ;i++){
		System.out.println("Thread Name: "+ Thread.currentThread().getName()+" Counter :"+i+ ", Timer : "+ System.currentTimeMillis());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}
public class ExecutorServiceDemo {

	public static void main(String[] args) {
		
		ImplementRun ir1 = new ImplementRun();
		ImplementRun ir2 = new ImplementRun();
		ImplementRun ir3 = new ImplementRun();
		
		ExecutorService pool = Executors.newFixedThreadPool(3);
		
		pool.execute(ir1);
		pool.execute(ir2);
		pool.execute(ir3);
	
		pool.shutdown();
	
	}

}
