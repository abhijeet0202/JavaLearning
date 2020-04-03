package MultiThreading.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ThreadsPrintInSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub// Create the workers
        Worker w1 = new Worker();
        Worker w2 = new Worker();
        Worker w3 = new Worker();
        
        // chain them in a round robin fashion
        w1.setNext(w2);
        w2.setNext(w3);
        w3.setNext(w1);
        
        // Create named threads for the workers
        new Thread(w1, "Thread-1 - ").start();
        new Thread(w2, "Thread-1 - ").start();
        new Thread(w3, "Thread-1 - ").start();
        
        // Seed the first worker
        w1.accept(1);

	}

}


class Worker implements Runnable{
    
    BlockingQueue<Integer> q = new LinkedBlockingQueue<Integer>(); 
    Worker next = null; // next worker in the chain
 
    public void setNext(Worker t) {
        this.next = t;
    }
    
    public void accept(int i) {
        q.add(i);
    }
    
    @Override
    public void run() {
        while (true){
            try {
                int i = q.take(); // blocks till it receives a number
                
                System.out.println( Thread.currentThread().getName() +  i);
                
                Thread.sleep(1000); // delay to slow the printing
                if (next != null){
                    next.accept(i+1); // pass the next number to the next worker 
                }
 
            } catch (InterruptedException e) {
                System.err.println( Thread.currentThread().getName() + " interrrupted.");
            }
        }
    }
}