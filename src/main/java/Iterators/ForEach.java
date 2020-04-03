package Iterators;

public class ForEach {

	public static void main(String[] args) {
		int nums[] = {11,2,333,41,5,62,7,8,9,10};
		int sum = 0;
		
		for(int x: nums){
			System.out.println("Value is: "+ x);
			sum += x;
		}
		System.out.println("Total : " +sum);
	}

}
