package MultiThreading.CompletitionService;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * To Understand the difference between ExecutorService and CompletitionService
 * http://www.nurkiewicz.com/2013/02/executorcompletionservice-in-practice.html
 */

class MyTask implements Callable<String> {
	private int timeTakenToCompleteTask;

	public MyTask(int timeTakenToCompleteTask) {
		this.timeTakenToCompleteTask = timeTakenToCompleteTask;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(timeTakenToCompleteTask);
		return Thread.currentThread().getName() + " I Worked for " + timeTakenToCompleteTask + " milliseconds";
	}

}

public class MyCompletitionService {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		List<MyTask> taskList = new ArrayList<>();
		taskList.add(new MyTask(5000));
		taskList.add(new MyTask(4000));
		taskList.add(new MyTask(3000));
		taskList.add(new MyTask(2000));
		taskList.add(new MyTask(1000));
		//usingExecutorService(taskList);
		usingCompletitionService(taskList);
	}
	
	public static void usingExecutorService(List<MyTask> taskList) throws InterruptedException, ExecutionException{
		ExecutorService e = Executors.newFixedThreadPool(5);
		List<Future<String>> result = new ArrayList<>();
		for (MyTask task : taskList) {
			result.add(e.submit(task));
		}
		for (Future<String> future : result) {
			System.out.println(future.get());
		}
		e.shutdown();
	}
	
	public static void usingCompletitionService(List<MyTask> taskList) throws InterruptedException, ExecutionException{
		ExecutorService e = Executors.newFixedThreadPool(5);
		CompletionService<String> cs = new ExecutorCompletionService<>(e);
		for (MyTask myTask : taskList) {
			cs.submit(myTask);
		}
		for(int i=0;i<taskList.size();i++){
			Future<String> future = cs.take();
			System.out.println(future.get());
		}
		e.shutdown();
	}
}
