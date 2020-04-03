package Programs;

public class Pangrams {

	public static String isPangram(String[] args) {

		StringBuilder result = new StringBuilder();

		for (String s : args) {

			s = s.replace(" ", "");
			if (isPangram(s)) {

				result.append("\""+s +"\"" +" is Panagram\n");
			} else {
				result.append("\""+s +"\"" +" is Not a Panagram\n");
			}
		}
		return result.toString();
	}

	private static boolean isPangram(String s) {

		boolean[] flag = new boolean[26];

		for (byte b : s.getBytes()) {

			if (Character.isWhitespace(b)) {
				continue;
			}
			//exception handling when putting numeric or CAPITAL 
			flag[b - 97] = true;
		}
		return isAllSet(flag);
	}

	private static boolean isAllSet(boolean[] flag) {

		for (boolean b : flag) {
			if (!b) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		//String r = isPangram(new String[] { "abcdefghijklmnopqrstuv wx   yz   ", "qwert yuioplk jhgfdsazxcv bnm",	"dffffffffffffffffffffffffffff" });
		String r = isPangram(new String[] { "the quick brown fox jumps over a lazy dog" });
		System.out.println(r);
	}

}
