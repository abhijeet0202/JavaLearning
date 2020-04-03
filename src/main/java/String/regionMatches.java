package String;

class regionMatches {

	public static void main(String[] args) {
		String s1 = "Hello, How are you";
		String s2 = "HELLO";
		/*
		 * ignoreCase : not a case sensitive
		 * startIndex : Index at which the region begins of invoking String Object
		 * str2: The String being compared by
		 * str2startIndex: Index at which comparisons begins of second String Object
		 * numChars: Length of substring being compared is passed.
		 */
		System.out.println(s1.regionMatches(true, 0, s2, 0, 4));
	}

}
