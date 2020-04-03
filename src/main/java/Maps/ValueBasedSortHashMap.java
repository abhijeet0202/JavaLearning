package Maps;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ValueBasedSortHashMap {

	public static void main(String[] args) {
		Map<String,Integer> unSortedMap = new HashMap<String,Integer>();


		unSortedMap.put("A", 2);
		unSortedMap.put("B", 1);
		unSortedMap.put("H", 7);
		unSortedMap.put("I", 8);
		unSortedMap.put("J", 6);
		
		//Before Sorting
		printMap(unSortedMap);
		Map<String, Integer> sortedData = sortMapOrdered(unSortedMap, false);
		printMap(sortedData);
	}
	
	public static void printMap(Map<String,Integer> unSortedData){
		
		for (Entry<String, Integer> myEntry: unSortedData.entrySet()){
			System.out.println("Key : " + myEntry.getKey() + " Value : "+ myEntry.getValue());
		}
	}
	
	public static Map<String, Integer> sortMapOrdered(Map<String, Integer> unSortedData, boolean isAscending) {
		List<Entry<String, Integer>> myList = new LinkedList<Entry<String, Integer>>(unSortedData.entrySet());
		System.out.println(myList);

		// Sorting the list
		Collections.sort(myList, new Comparator<Entry<String, Integer>>() {
			@Override
			public int compare(Entry<String, Integer> object1, Entry<String, Integer> object2) {

				if (isAscending)
					return object1.getValue().compareTo(object2.getValue());
				else
					return object2.getValue().compareTo(object1.getValue());
			}
		});
		
		// Maintaining insertion order with the help of LinkedList
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Entry<String, Integer> entry : myList)
        {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
	}

}
