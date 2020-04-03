package StringBuffer;

class lengthAndCapacity1 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("buffer = " + sb);
		System.out.println("length = " + sb.length());
		System.out.println("capacity = " + sb.capacity());
		
		
		StringBuffer sb1 = new StringBuffer("Hello");
		System.out.println("buffer = " + sb1);
		System.out.println("length = " + sb1.length());
		System.out.println("capacity = " + sb1.capacity());
	}

}
