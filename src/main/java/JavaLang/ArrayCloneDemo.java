package JavaLang;

public class ArrayCloneDemo {
	
	private static final int[] PRIVATE_VALUES = {1,2,3,4,5};
	
	public static final int[] unmodifiabale_values(){
		return PRIVATE_VALUES.clone();
	}
	
	public static final int[] modifiabale_values(){
		return PRIVATE_VALUES;
	}
	
	public static void print(){
		for (int i=0 ;i <5; i++){
			System.out.print(PRIVATE_VALUES[i]+ ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = ArrayCloneDemo.unmodifiabale_values();	
		arr[1] = 6;		
		ArrayCloneDemo.print();
		
		int arr1[] = ArrayCloneDemo.modifiabale_values();	
		arr1[1] = 6;		
		ArrayCloneDemo.print();
	}

}
