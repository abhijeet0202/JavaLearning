/**
 * 
 */
package JavaLang;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author abhibane
 *
 */

class MyTimerTask extends TimerTask{
	
	Date date = new Date();
	public void run(){
		System.out.println("Timer Task Scheduled" +date+ "  "+ System.currentTimeMillis());
	}
}
final class TimerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		MyTimerTask mTT = new MyTimerTask();
		Timer timer = new Timer();
		
		timer.schedule(mTT, 1000, 2000);
		
		try{
		Thread.sleep(10000);
		} catch (InterruptedException ex){
			System.out.println(ex.getLocalizedMessage());
		}
		
		timer.cancel();
	}

}
