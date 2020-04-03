/**
 * 
 */
package Generic;

/**
 * @author abhibane
 *
 */
class SampleGenericMethod {

	/* static<T, V extends T> : The DataType parameter is declared before the return type.
	 * NOTE : V is upper bound of T, i.e. T always should be either V or its subclass.
	 * For Example:
	 * 	If T is Integer, then V Should be Integer, Not String
	 *  If T is Number, then V can be Integer, Float, Double but Never be String.
	 *  
	 */
	static<T, V extends T> boolean isIn(T t, V[] num){
		
		for(int i =0 ; i< num.length;i++){
			if(t == num[i]){
				System.out.println(t+" is present inside array");
				return true;
			}
		}
		System.out.println(t+" is not present inside array");
		return false;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Integer iInt[] = {1,2,3,4,5,6,7};
		
		new SampleGenericMethod();
		SampleGenericMethod.isIn(2, iInt);
		
		String sInt[] = {"One","Two","Three","Four","Five","Six"};
		
		SampleGenericMethod.isIn("Seven", sInt);
	}

}
