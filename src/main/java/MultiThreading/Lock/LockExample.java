package MultiThreading.Lock;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class PrinterQueue
{
   private final Lock queueLock = new ReentrantLock();
 
   public void printJob(Object document)
   {
      queueLock.lock();
      try
      {
         System.out.println(Thread.currentThread().getName() + ": PrintQueue: Printing a Job during "  + new Date());
         Thread.sleep(10000);
      } catch (InterruptedException e)
      {
         e.printStackTrace();
      } finally
      {
         System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
         queueLock.unlock();
      }
   }
}

class PrintingJob implements Runnable
{
   private PrinterQueue printerQueue;
 
   public PrintingJob(PrinterQueue printerQueue)
   {
      this.printerQueue = printerQueue;
   }
 
   @Override
   public void run()
   {
      System.out.printf("%s: Going to print a document\n", Thread.currentThread().getName());
      printerQueue.printJob(new Object());
   }
}
public class LockExample
{
   public static void main(String[] args)
   {
      PrinterQueue printerQueue = new PrinterQueue();
      Thread thread[] = new Thread[10];
      for (int i = 0; i < 10; i++)
      {
         thread[i] = new Thread(new PrintingJob(printerQueue), "Thread " + i);
      }
      for (int i = 0; i < 10; i++)
      {
         thread[i].start();
      }
   }
}