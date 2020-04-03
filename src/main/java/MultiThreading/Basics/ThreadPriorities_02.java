package MultiThreading.Basics;

class HiLoPriority implements Runnable{
	
	Thread t;
	private volatile boolean running = false;
	long click = 0;
	
	public HiLoPriority(int level) {
		t = new Thread(this);
		t.setPriority(level);
	}
	@Override
	public void run() {
		System.out.println("Inside Run: ");
		while (running)
			++click;
	}
	
	public void start(){
		System.out.println("Inside Start: ");
		running = true;
		t.start();
	}
	
	public void stop(){
		System.out.println("Inside Stop: ");
		running = false;
	}
}

public class ThreadPriorities_02 {

	
	public static void main(String[] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		HiLoPriority hi = new HiLoPriority(Thread.NORM_PRIORITY +2);
		HiLoPriority lo = new HiLoPriority(Thread.NORM_PRIORITY -2);
		
		hi.start();
		lo.start();
		
		try{
			Thread.sleep(10000);
		}catch (InterruptedException ex){
			System.out.println(ex);
		}
		
		hi.stop();
		lo.stop();
		
		try{
			
			hi.t.join();
			lo.t.join();
		}catch (InterruptedException ex){
			System.out.println(ex);
		}
		System.out.println("Low-priority thread: " + lo.click);
		System.out.println("High-priority thread: " + hi.click);
	}
	
}
