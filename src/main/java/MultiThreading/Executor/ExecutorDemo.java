package MultiThreading.Executor;

import java.util.concurrent.Executor;
class RunnableClass implements Runnable{

	@Override
	public void run() {
		System.out.println("Calling Runable Run");
		
	}
	
}
public class ExecutorDemo implements Executor{
	RunnableClass myRunnableClass = null;
	
	ExecutorDemo(RunnableClass runnableClass){
		this.myRunnableClass = runnableClass;
	}
	
	
	public static void main(String[] args) {
		RunnableClass runnableClass = new RunnableClass();
		ExecutorDemo executorDemo = new ExecutorDemo(runnableClass);
		executorDemo.execute(runnableClass);

	}

	@Override
	public void execute(Runnable runnable) {
		new Thread(runnable).start(); 
		System.out.println("Abhijeet");
		
	}

}
