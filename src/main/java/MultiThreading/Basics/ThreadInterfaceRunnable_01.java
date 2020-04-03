/**
 * 
 */
package MultiThreading.Basics;

import java.sql.Date;

/**
 * @author abhibane
 *
 */
public class ThreadInterfaceRunnable_01 {

	public static void main(String[] args) {
		new ThreadDemo();
		try{
			for(int i = 0; i<5; i++){
				System.out.println("Value of Main i:"+i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException exp) {
			
		}

	}

}

class ThreadDemo implements Runnable {
	
	Thread thread;
	ThreadDemo(){
		//Creating a new Child Thread
		thread = new Thread(this, "AbhijeetThread");
		System.out.println("Child Thread Information:\n Thread Name:"+thread.getName()+"\n Thread ID"+thread.getId()+"\n Thread Priority"+thread.getPriority());
		thread.start();
	}	
	
	//This is the entry point for Child Threads
	public void run(){
		Date date = new Date(0);
		try{
			for (int i =0; i<5 ; i++){
				System.out.println("Value Of i is:"+i+" "+date.toString());
				Thread.sleep(1000);
			}
		} catch (InterruptedException exp) {
			System.out.println("Printing Exception Description:"+exp.toString());
		}
		System.out.println("Bye Bye Child Thread");
	}
}
