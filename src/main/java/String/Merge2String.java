package String;

public class Merge2String {

	public static void main(String[] args) {
		System.out.println(Merge2String.merge("abc", "def "));
	}

	public static String merge(String a, String b) {
		int ia = a.length();
		int ib = b.length();
		
		if (ia == 0 && ib == 0)
			return null;

		String result = new String();
		int i = 0;
		int j = 0;
		int k = 1;
		while (i < ia && j < ib) {
			if (k % 2 != 0) {
				result += a.charAt(i);
				i++;
			} else {
				result += b.charAt(j);
				j++;
			}
			k++;
		}

		while (i < ia) {
			result += a.charAt(i);
			i++;
		}

		while (j < ib) {
			result += b.charAt(j);
			j++;
		}

		return result;

	}

}
