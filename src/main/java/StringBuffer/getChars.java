package StringBuffer;

final class getChars {

	public static void main(String[] args) {
		char target[] = new char[9];
		StringBuffer sb = new StringBuffer("How are you Abhijeet");
		
		sb.getChars(12, 20, target, 1);
		String sb1 = new String(target);
		System.out.println("["+sb1+"]");
		
	}

}
