package Practice;

public class Palindrom {
	
	public static void main(String[] args) {
		palindrom("ABC");
	}
	
	public static boolean isPalindrom(String str) {
		int length = str.length();
		for (int i =0, j = length -1; i <= j ;i++,j--) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
		}
		return true;
	}
	public static void palindrom(String str) {
		int flag = 0;
		int count = 0;
		while(str.length() > 0) {
			if (isPalindrom(str)) {
				flag = 1;
				break;
			}else {
				//count++;
				System.out.print(str.charAt(str.length()-1));
				str = str.substring(0,str.length() -1);
			}
		}
		if (flag ==1) {
			
		}
	}
}
