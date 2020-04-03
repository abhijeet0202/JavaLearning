package MultiThreading.Concurrent;

import java.util.concurrent.atomic.AtomicInteger;

public final class DemoAtomicVariables {
	private AtomicInteger aInt = new AtomicInteger(0);
	
	
	public static void main(String[] args) {
		DemoAtomicVariables de = new DemoAtomicVariables();
			de.increment();
			de.increment();
			de.increment();
			de.decrement();
			de.increment();
			de.decrement();
			de.increment();
			de.decrement();
			de.increment();
			de.decrement();
			System.out.println(de.value());
			
	}

	public void increment() {
		aInt.incrementAndGet();
    }

    public void decrement() {
    	aInt.decrementAndGet();
    }

    public int value() {
        return aInt.get();
    }
}
