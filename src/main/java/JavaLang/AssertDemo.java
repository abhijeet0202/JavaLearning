package JavaLang;

class AssertDemo {

	static int value = 3;
	
	static int returnValue(){
		return value--;
	}
	public static void main(String[] args) {

		int n;
		for (int i = 0; i <= 10; i++){
			n = returnValue();
			
			assert n > 0 : "n is negative";
			
			System.out.println("Value Of n : "+n);
		}
		
	}

}
