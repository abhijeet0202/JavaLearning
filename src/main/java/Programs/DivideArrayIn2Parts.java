package Programs;

public class DivideArrayIn2Parts {
	
	public int find(int[]a, int length) {
		// Initializing lower Index and higher Index [Assuming]
		int lowerIndex = 0, higherIndex = length -1;
		// Initializing half of lower and higher

		if (length <= 0) {
			return -1;
		}
		int element = a[0];
		// Start Infinite Loop
		while (true) {
			int currentLoc = (lowerIndex + higherIndex) / 2;
			if (lowerIndex > higherIndex) {
				return currentLoc;
			} else 
				
				if (a[currentLoc] <= element) {
					lowerIndex = currentLoc + 1;
				} else {
					return currentLoc;
				}
			}
		}

	public static void main(String[] args) {
		
		/*
		 * Think of below array examples are weather (i.e. temperature ) for any country
		 * Which always start as Winter season and end up in Summer season.{5,-3,6,8};
		 * Divide the values in 2 parts in such a way winter comes in a bracket and summer comes in other bracket {5, -3} {6, 8}
		 * Then return the number of elements Contains in Winter Season Answer 2
		 * 
		 * Another Example 
		 * -5, -5, -5, -42, 6, 12
		 * {-5, -5, -5, -42} { 6, 12}
		 * Return 4
		 * 
		 * {7,-3,-3,-6,8,9}
		 * {7,-3,-3,-6} {8,9}
		 * Return 4
		 */
				//int[] a = {5,-3,6,8};
				int[]a = {-3,-3,-6,8,9};
				//int a[] = {-5, -5, -5, -42, 6, 12};
				
				DivideArrayIn2Parts obj = new DivideArrayIn2Parts();
				int breaki = obj.find(a,a.length);
				System.out.println(breaki);

	}

}
