package MultiThreading.Basics;

public class JoinConcept {
	
	public static void main(String args[]) {
		MyJoinThread thread1 = new MyJoinThread("one");
		MyJoinThread thread2 = new MyJoinThread("Two");
		MyJoinThread thread3 = new MyJoinThread("Three");
		
		System.out.println("thread1.isAlive:"+thread1.thread.isAlive());
		System.out.println("thread2.isAlive:"+thread2.thread.isAlive());
		System.out.println("thread3.isAlive:"+thread3.thread.isAlive());
		
		try{
			System.out.println("Main Sleeping");	
			
			thread1.thread.join();
			thread2.thread.join();
			thread3.thread.join();
			
			System.out.println("Main Awake");
			
		} catch (InterruptedException ex){
			System.out.println("Value of exp:"+ex.toString() );
		}
		
		System.out.println("thread1.isAlive:"+thread1.thread.isAlive());
		System.out.println("thread2.isAlive:"+thread2.thread.isAlive());
		System.out.println("thread3.isAlive:"+thread3.thread.isAlive());
	}
}
class MyJoinThread implements Runnable{
	
	Thread thread;
	String threadname;
	
	public MyJoinThread(String name) {
		threadname = name;
		thread = new Thread(this, name);
		System.out.println("Starting Thread:"+thread);
		thread.start();
	}
	
	public void run(){
		try{
			for (int i =0; i<5; i++){
				System.out.println("Child Thread Information:\n Thread Name:"+thread.getName()+"\n Thread ID"+thread.getId()+"\n Thread Priority"+thread.getPriority());
				System.out.println(" thread.isAlive:"+thread.isAlive());
				Thread.sleep(1000);
			}
		} catch (InterruptedException ex){
			System.out.println("Value of exp:"+ex.toString() );
		}
	}
}

