package String;

class indexOf {

	public static void main(String[] args) {
		String str = "My Name is Abhijeet, Studying String's character Searching, which is important";

		//Character Search
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		
		//String Search
		System.out.println(str.indexOf("is"));
		System.out.println(str.lastIndexOf("is"));
		
		//String Search after given index
		System.out.println(str.indexOf("is", 10));
		System.out.println(str.lastIndexOf("is",46));
	}

}
