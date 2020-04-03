package Iterators;

import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FailSafeIterator {

	void failFastExample() {

		try {
			Map<String, String> premiumPhone = new HashMap<String, String>();
			premiumPhone.put("Apple", "iPhone");
			premiumPhone.put("HTC", "HTC one");
			premiumPhone.put("Samsung", "S5");

			Iterator<String> iterator = premiumPhone.keySet().iterator();

			while (iterator.hasNext()) {
				System.out.println(premiumPhone.get(iterator.next()));
				premiumPhone.put("Sony", "Xperia Z");
			}
		} catch (ConcurrentModificationException ex) {
			ex.printStackTrace();
		}
	}

	void failSafeExample() {
		Map<String, String> premiumPhone = new ConcurrentHashMap<String, String>();
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung", "S5");

		Iterator<String> iterator = premiumPhone.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
			premiumPhone.put("Sony", "Xperia Z");
		}
	}

	public static void main(String[] args) {

		FailSafeIterator failSafeIterator = new FailSafeIterator();
		failSafeIterator.failFastExample();
		System.out.println("--------------------------");
		failSafeIterator.failSafeExample();
	}
}