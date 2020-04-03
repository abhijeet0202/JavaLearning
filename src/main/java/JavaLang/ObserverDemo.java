/**
 * 
 */
package JavaLang;

import java.util.Observable;
import java.util.Observer;

/**
 * @author abhibane
 *
 */
class Watcher implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("update() called, count is " + ((Integer)arg).intValue());
	}
	
}

class BeingWatched extends Observable{
	
	void counter(int period) {
		for( ; period >=0; period--) {
			setChanged();
			notifyObservers(new Integer(period));
			try {
				Thread.sleep(100);
			} catch(InterruptedException e) {
				System.out.println("Sleep interrupted");
			}
		}
	}
}
final class ObserverDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BeingWatched observed = new BeingWatched();
		Watcher observing = new Watcher();
		
		/* Add the observing to the list of observers for observed object. */
		observed.addObserver(observing);
		observed.counter(10);
	}

}
