package String;

class characterExtraction {

	public static void main(String[] args) {
		String str = "My Name is Abhijeet, Studying String's character Extaction";

		// Demo of charAt()
		int i =0;
		do{
			System.out.println(str.charAt(i)+ " " +i);
			i++;
		}
		while (i < str.length());

		//Demo of getChars()
		int srcStart = 30;
		int srcEnd = 37+1;
		char target[] = new char[srcEnd- srcStart];
		str.getChars(srcStart, srcEnd, target, 0);
		System.out.println(target);

		//Demo of getBytes
		byte byteObj[] = str.getBytes();
		System.out.println(byteObj);
		int length = byteObj.length;
		for (i =0; i<length; i++)
			System.out.println(byteObj[i]);
		//Output: 77, 121, 32, 78, 97, 109, 101, 32, 105, 115, 32, 65, 98, 104, 105, 106, 101, 101, 116, 44, 32, 83, 116, 117, 100, 121, 105, 110, 103, 32 ...
	}
}
