package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMap {

	public Map<Integer, Integer> myUnSortObj = new HashMap<Integer, Integer>();
	
	public Map<Integer,Integer> sort(Map<Integer, Integer> myUnSortObj){
		
		Map<Integer, Integer> mySortObj = new TreeMap<Integer, Integer>(myUnSortObj);
		return mySortObj;
		
	}
	public static void main(String[] args) {
		int minimum = 1, maximum =700;
		SortMap obj = new SortMap();
		Map<Integer, Integer> output;
		
		for (int i= 0; i< 20; i++){
			int randomNum = minimum + (int)(Math.random() * maximum);
			obj.myUnSortObj.put(randomNum , randomNum);
		}
		
		output = obj.sort(obj.myUnSortObj);
		System.out.println(output);
	}

}
