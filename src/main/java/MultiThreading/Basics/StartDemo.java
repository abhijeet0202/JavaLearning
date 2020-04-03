package MultiThreading.Basics;

public class StartDemo extends Thread{
	
	public void start(){
		System.out.println("Start");
	}
	/*public void run(){
		System.out.println("run");
	}*/
	public static void main(String[] args) {
		new Thread(new StartDemo()).start();

	}

}
