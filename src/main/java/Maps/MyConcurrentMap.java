package Maps;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class MyConcurrentMap {

	public static void main(String[] args) {
		
		ConcurrentMap<String, String> tokenCacheMap = new ConcurrentHashMap<String, String>();
		tokenCacheMap.put("Abhijeet", "value");
		tokenCacheMap.put("Abhijeet", "value1");
		tokenCacheMap.put("Abhijeet", "value2");
		
		System.out.println(tokenCacheMap);

	}

}
