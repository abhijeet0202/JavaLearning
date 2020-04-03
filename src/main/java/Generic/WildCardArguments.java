/**
 * 
 */
package Generic;

class WildCard<T extends Number>{
	T nums[];
	
	public WildCard(T[] obj) {
		nums = obj;
	}
	
	double average(){
		double num = 0.0;
		
		for (int i = 0 ; i < nums.length ;i++){
			num += nums[i].doubleValue();
		}
		return num/nums.length;
	}
	
	boolean isSame(WildCard<?> object){
		if (this.average() == object.average()){
			return true;
		}
		return false;
	}
}
class WildCardArguments {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer intValue[] = {1,3,3,4,5,6};
		Double doubleValue[] = {1.0,2.0,3.0,4.0,5.0,6.0};
		Float floatValue[] = {1.0F,2.0F,3.0F,4.0F,5.0F,6.0F};
		
		WildCard<Integer> iNum = new WildCard<Integer>(intValue);
		WildCard<Double> dNum = new WildCard<Double>(doubleValue);
		WildCard<Float> fNum = new WildCard<Float>(floatValue);
		
		if( iNum.isSame(dNum)){
			System.out.println("Integer and Double are same average");
		}
		else{
			System.out.println("Integer and Double not have same average");
		}
		
		
		if( dNum.isSame(fNum)){
			System.out.println("Double and Float are same average");
		}
		else{
			System.out.println("Double and Float not have same average");
		}
		
		if( fNum.isSame(iNum)){
			System.out.println("Float and Integer are same average");
		}
		else{
			System.out.println("Float and Integer not have same average");
		}
	}

}
