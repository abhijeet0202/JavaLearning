/**
 * 
 */
package Maps;

import java.util.HashMap;
import java.util.Map;

/**
 * @author abhibane
 *
 */
final class HashMapDemo1 {

	public int singleNumber(int[] nums) {
		 int res = nums[0]; 
	        for (int i = 1; i < nums.length; i++) 
	            res = res ^ nums[i];
	        return res; 
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		HashMap<String, Double> hmObj = new HashMap<String, Double>();
//		
//		hmObj.put("John Doe", new Double(3434.34));
//		hmObj.put("Tom Smith", new Double(123.22));
//		hmObj.put("Jane Baker", new Double(1378.00));
//		hmObj.put("Tod Hall", new Double(99.22));
//		hmObj.put("Ralph Smith", new Double(-19.08));
//		
//		Set<Map.Entry<String, Double>> set = hmObj.entrySet();
//		
//		for (Map.Entry<String,Double> myset :set){
//			System.out.println(myset.getKey() + ":" + myset.getValue());
//		}
//		
//		double balance = hmObj.get("John Doe");
//		hmObj.put("John Doe", balance + 1000.00);
//		
//		System.out.println(hmObj);
		HashMapDemo1 demo1 = new HashMapDemo1();
		int[] myarr = new int[] {2,2,1};
		System.out.println(demo1.singleNumber(myarr));
		
		
	}

}
