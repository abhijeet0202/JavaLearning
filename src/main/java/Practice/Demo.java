package Practice;

public class Demo {
	static int[] stocks = new int[] {5,2,6,1,7,9,4,12,8,16};
	
	public static void maxProfit() {
		int min = stocks[0];
		int result=0;
		
		for(int i=0;i<stocks.length;i++) {
			result= Math.max(result, stocks[i]-min);
			min= Math.min(min,stocks[i]);
		}
		
		System.out.println(result+"::::"+min+"::::"+result+min);
	}

	public static void main(String[] args) {
		//Demo.maxProfit();
		

	}

}
