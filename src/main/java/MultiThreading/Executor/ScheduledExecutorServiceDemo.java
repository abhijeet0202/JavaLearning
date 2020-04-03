package MultiThreading.Executor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {

	public static void main(String[] args) {
		
		ImplementRun ir1 = new ImplementRun();
		ImplementRun ir2 = new ImplementRun();
		
		
		ScheduledExecutorService sES = Executors.newScheduledThreadPool(2);
		//sES.scheduleWithFixedDelay(ir1, 5, 5, TimeUnit.SECONDS);
		//sES.scheduleWithFixedDelay(ir2, 5, 5, TimeUnit.MILLISECONDS);
		
		
		sES.scheduleWithFixedDelay(ir1, 2, 5, TimeUnit.SECONDS);
		sES.scheduleWithFixedDelay(ir2, 0, 1, TimeUnit.MINUTES);
	}

}
