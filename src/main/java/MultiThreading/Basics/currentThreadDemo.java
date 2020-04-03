/**
 * 
 */
package MultiThreading.Basics;

/**
 * @author abhibane
 *
 */
public class currentThreadDemo {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		
		System.out.println("Printing +thread information : "+thread);
		System.out.println("Main Thread Information:\n Thread Name:"+thread.getName()+"\n Thread ID"+thread.getId()+"\n Thread Priority"+thread.getPriority());
		
		thread.setName("Abhijeet Thread");
		thread.setPriority(1);
		System.out.println("After Changing Main Thread Information:\n Thread Name:"+thread.getName()+"\n Thread ID"+thread.getId()+"\n Thread Priority"+thread.getPriority());
		
		try{
			for (int i = 0; i<= 5; i++){
				System.out.println("Value of i :"+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException exp) {
			System.out.println("Value of exp:"+exp.toString() );
		}
		finally{
			System.out.println("All Done");
		}
	}

}
