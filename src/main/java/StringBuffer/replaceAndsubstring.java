package StringBuffer;

final class replaceAndsubstring {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
		
		
		
		System.out.println("Before Calling replace() "+sb);
		sb.replace(0, 26, "abcdefghijklmnopqrstuvwxyz");
		System.out.println("After Calling replace()  "+sb);
		
		System.out.println();
		System.out.println("Before Calling substring(4) "+sb);		
		System.out.println("After Calling substring(4)  "+sb.substring(4));
		
		
		System.out.println();
		System.out.println("Before Calling substring(4,10) "+sb);		
		System.out.println("After Calling substring(4,10)  "+sb.substring(4,10));
	}

}
