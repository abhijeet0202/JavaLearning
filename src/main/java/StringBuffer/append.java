package StringBuffer;

final class append {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		String s = "Abhijeet";
		int i = 23;
		
		System.out.println(sb.append(s).append(i).append('!').append("My"));
	}

}
