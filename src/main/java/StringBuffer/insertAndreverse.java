package StringBuffer;

final class insertAndreverse {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		
		//INSERT DEMO
		System.out.println(sb.insert(0, true).insert(4, "$").insert(5, 'c').insert(6, " ").insert(7, 34.5));
		
		
		//REVERSE
		System.out.print("Reverse of "+sb+" is: ");
		sb.reverse();
		System.out.println(sb);
		
		
	}

}
