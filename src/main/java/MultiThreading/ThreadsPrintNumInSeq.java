package MultiThreading;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadsPrintNumInSeq {
	
	

	public static void main(String[] args) {
		System.out.println("Enter Total No. of Thread");
		int numOfThreads= new Scanner(System.in).nextInt();
		for (int i = 1;i <=numOfThreads;i++){
			new Thread(new Printer(i, numOfThreads), "T"+i).start();;
		}
	}

}

class Printer implements Runnable {
	public volatile static AtomicInteger number = new AtomicInteger(1);
	int threadId;
	int numOfThreads;

	Printer(int threadId, int numOfThreads) {
		this.threadId = threadId;
		this.numOfThreads = numOfThreads;
	}

	@Override
	public void run() {
		print();
	}

	private void print() {
		try {
			while (true) {
				
				synchronized (number) {
					if ((number.get() % numOfThreads == this.threadId) || ((number.get() % numOfThreads == 0)&&(this.threadId == numOfThreads))){
						System.out.println("Thread ID: "+threadId+ "Print: "+number.getAndIncrement());
						number.notifyAll();
					}else{
						System.out.println("Thread ID: "+threadId + "current value:" +number.get());
						Thread.sleep(100);
					}

				}
			}
			// System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
