/**
 * 
 */
package Generic;

/**
 * Create a generic class that can compute the average of an array of Numbers of any given type.
 * @author abhibane
 */
class Bounded<T extends Number>{
	T nums[]; // Numbers of array of T type
	
	Bounded(T[] obj){
		nums = obj;
	}
	
	double average(){
		double sum =0.0;
		
		for (int i =0; i<nums.length; i++){
			sum += nums[i].doubleValue();
		}
		return sum/nums.length;
	}
}
class BoundedGeneric {

	public static void main(String[] args) {

		Integer IntNums[] = {1,2,3,4,5,6};
		
		Bounded<Integer> iNums = new Bounded<Integer>(IntNums);
		double d= iNums.average();
		System.out.println("Average is :"+d);
		
		Double DouNums[] = {1.1,2.2,3.3,4.4,5.5,6.6};
		
		Bounded<Double> dNums = new Bounded<Double>(DouNums);
		double dou= dNums.average();
		System.out.println("Average is :"+dou);
		
		//String strNums[] = {"Apple","Banana", "Cocunut"};
		
		// Bounded<String> sNums = new Bounded<String>(strNums); //Error: Becase Bounded class extends Number as superclass.String is not a part of Number class
		//double d= iNums.average();
		//System.out.println("Average is :"+d);
		
	}

}
