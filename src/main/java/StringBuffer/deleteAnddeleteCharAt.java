package StringBuffer;

final class deleteAnddeleteCharAt {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("My name is Abhijeet");
		
		System.out.println("Before Calling delete: "+sb);
		System.out.println("After Calling delete : "+sb.delete(11, 19));
		
		System.out.println();
		System.out.println("Before Calling deleteCharAt: "+sb);
		System.out.println("After Calling deleteCharAt : "+sb.deleteCharAt(3));
	}

}
