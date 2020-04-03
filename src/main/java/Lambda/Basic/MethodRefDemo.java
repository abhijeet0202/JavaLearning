package Lambda.Basic;

interface StringFunc{
	String func(String str);
}

class MyStringOps{
	static String reverseString(String str) {
		
		String result = "";
		int i;
		
		for (i = str.length()-1; i>=0;i--)
			result+=str.charAt(i);
		return result;
	}
}
public class MethodRefDemo {
	
	static String stringOp(StringFunc sf, String str) {
		return sf.func(str);
	}

	public static void main(String[] args) {
		String inStr = "My name is Abhijeet Banerjee";
		String outStr;
		outStr = stringOp(MyStringOps::reverseString, inStr);
		System.out.println(outStr);
	}

}
