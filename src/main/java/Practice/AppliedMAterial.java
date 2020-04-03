package Practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AppliedMAterial {

	List<String> myList = new ArrayList<>();
	Map<String, String> myMay = new HashMap<String, String>();

	// Question1 : Start
//	int rows=4;
//	int cols=4;
//	static int initR=1;
//	static int initC=2;
//	static int finalR=3;
//	static int finalC=3;
//	public static List<Integer> costRows;
//	public static List<Integer> costCols;
	// Question1 : End

	// Question2 : Start
	int rows = 3;
	int cols = 3;
	static int initR = 0;
	static int initC = 0;
	static int finalR = 1;
	static int finalC = 2;
	public static List<Integer> costRows;
	public static List<Integer> costCols;

	// Question2 : End
	static int cost;

	public static int minCost(int cost, int finalR, int finalC) {
		if (finalC < initC || finalR < initR)
			return Integer.MAX_VALUE;
		else if (finalC == initC && finalR == initR)
			return cost;
		else
			return cost + Math.min(minCost(costRows.get(finalR), finalR - 1, finalC),
					minCost(costCols.get(finalC), finalR, finalC - 1));
	}

	public static void main(String[] args) {

		// Question1 : Start
//		costRows = new ArrayList<Integer>();
//		costRows.add(3);
//		costRows.add(1);
//		costRows.add(2);
//		costRows.add(3);
//
//		costCols = new ArrayList<Integer>();
//		costCols.add(3);
//		costCols.add(7);
//		costCols.add(8);
//		costCols.add(9);
		// Question1 : END

		// Question2 : Start
		
		  costRows = new ArrayList<Integer>(); 
		  costRows.add(0);
		  costRows.add(2); 
		  costRows.add(5);
		  
		 
		 costCols = new ArrayList<Integer>();
		 costCols.add(0);
		 costCols.add(6);
		 costCols.add(1);
		 
		
		// Question2 : END
		System.out.println(AppliedMAterial.minCost(0, finalR, finalC));

	}

}
