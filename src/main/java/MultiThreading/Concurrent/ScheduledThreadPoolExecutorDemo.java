package MultiThreading.Concurrent;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorDemo {
	private ScheduledThreadPoolExecutor myThread;
	
	static final long C0 = 1L;
	static final long C1 = C0 * 1000L;
	static final long C2 = C1 * 1000L;
	static final long C3 = C2 * 1000L;
	static final long C4 = C3 * 60L;
	static final long C5 = C4 * 60L;
	static final long C6 = C5 * 24L;
	
	static final long MAX = Long.MAX_VALUE;
	
	ScheduledThreadPoolExecutorDemo(){
		myThread = new ScheduledThreadPoolExecutor(1);
	}
	
	private void countandGetUsage() {
		System.out.println("Inside countandGetUsage : :" +  System.currentTimeMillis());
	}
	
	private void createAndStartThread() {
		System.out.println("Inside createAndStartThread: :" + System.currentTimeMillis());
		myThread.schedule(() -> countandGetUsage(), 5, TimeUnit.SECONDS);
		
	}
	public long toMillis(long d) {
		return x(d,C4/C2, MAX/(C4/C2) );
	}
	static long x(long d, long m, long over) {
		if (d > over) return Long.MAX_VALUE;
		if (d < -over) return Long.MIN_VALUE;
		return d*m;
	}
	
	public static void main(String[] args) {
		ScheduledThreadPoolExecutorDemo demo = new ScheduledThreadPoolExecutorDemo();
		demo.createAndStartThread();
		
		System.out.println(demo.toMillis(5));

	}

}
