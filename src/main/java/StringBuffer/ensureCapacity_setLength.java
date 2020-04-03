package StringBuffer;

class ensureCapacity_setLength {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.ensureCapacity(70);
		
		
		System.out.println("buffer = " + "["+sb+"]");
		System.out.println("length = " + sb.length());
		System.out.println("capacity = " + sb.capacity());
		
		
		sb.setLength(7);
		System.out.println("buffer = " + "["+sb+"]");
		System.out.println("length = " + sb.length());
		System.out.println("capacity = " + sb.capacity());
	}

}
