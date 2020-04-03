package StringBuffer;

public class setCharAndCharAt3 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.setLength(8);
		sb.setCharAt(0, 'A');
		sb.setCharAt(1, 'B');
		sb.setCharAt(2, 'H');
		sb.setCharAt(3, 'I');
		sb.setCharAt(4, 'J');
		sb.setCharAt(5, 'E');
		sb.setCharAt(6, 'E');
		sb.setCharAt(7, 'T');
		
		System.out.println("buffer = " + "["+sb+"]");
		System.out.println("length = " + sb.length());
		System.out.println("capacity = " + sb.capacity());
		
		System.out.println("sb.charAt(0): "+sb.charAt(0));
	}

}
