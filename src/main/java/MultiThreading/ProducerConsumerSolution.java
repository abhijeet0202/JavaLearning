package MultiThreading;

import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
* Java program to solve Producer Consumer problem using wait and notify
* method in Java. Producer Consumer is also a popular concurrency design pattern.
*
* @author Abhijeet Banerjee
*/
public class ProducerConsumerSolution {

   public static void main(String args[]) {
       Vector<Integer> sharedQueue = new Vector<Integer>();
       int size = 4;
       Thread prodThread = new Thread(new SimpleProducer(sharedQueue, size), "Producer");
       Thread consThread = new Thread(new SimpleConsumer(sharedQueue, size), "Consumer");
       prodThread.start();
       consThread.start();
   }
}

class SimpleProducer implements Runnable {

   private final Vector<Integer> sharedQueue;
   private final int SIZE;

   public SimpleProducer(Vector<Integer> sharedQueue, int size) {
       this.sharedQueue = sharedQueue;
       this.SIZE = size;
   }

   @Override
   public void run() {
       for (int i = 0; i < 17; i++) {
           System.out.println("Produced: " + i);
           try {
               produce(i);
           } catch (InterruptedException ex) {
               Logger.getLogger(SimpleProducer.class.getName()).log(Level.SEVERE, null, ex);
           }

       }
   }

   private void produce(int i) throws InterruptedException {

       //wait if queue is full
       while (sharedQueue.size() == SIZE) {
           synchronized (sharedQueue) {
               System.out.println("Queue is full " + Thread.currentThread().getName()
                                   + " is waiting , size: " + sharedQueue.size());

               sharedQueue.wait();
           }
       }

       //producing element and notify consumers
       synchronized (sharedQueue) {
           sharedQueue.add(i);
           sharedQueue.notifyAll();
       }
   }
}

class SimpleConsumer implements Runnable {

   private final Vector<Integer> sharedQueue;
   @SuppressWarnings("unused")
private final int SIZE;

   public SimpleConsumer(Vector<Integer> sharedQueue, int size) {
       this.sharedQueue = sharedQueue;
       this.SIZE = size;
   }

   @Override
   public void run() {
       while (true) {
           try {
               System.out.println("Consumed: " + consume());
               Thread.sleep(50);
           } catch (InterruptedException ex) {
               Logger.getLogger(SimpleConsumer.class.getName()).log(Level.SEVERE, null, ex);
           }

       }
   }

   private int consume() throws InterruptedException {
       //wait if queue is empty
       while (sharedQueue.isEmpty()) {
           synchronized (sharedQueue) {
               System.out.println("Queue is empty " + Thread.currentThread().getName()
                                   + " is waiting , size: " + sharedQueue.size());

               sharedQueue.wait();
           }
       }

       //Otherwise consume element and notify waiting producer
       synchronized (sharedQueue) {
           sharedQueue.notifyAll();
           return (Integer) sharedQueue.remove(0);
       }
   }
}

