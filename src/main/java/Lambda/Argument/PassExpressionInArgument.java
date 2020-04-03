package Lambda.Argument;

interface StringOperation {
	String operate(String str);
}

public class PassExpressionInArgument {

	static String Operation(StringOperation so, String str) {
		return so.operate(str);
	}

	public static void main(String[] args) {

		String inputString = "my name is abhijeet";
		// Case 1:
		System.out.println(Operation((so) -> so.toUpperCase(), inputString));

		// Case 2
		// Case 3
		StringOperation reverse = (str) -> {
			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result = result + str.charAt(i);
			}
			return result;
		};
		System.out.println(Operation(reverse, inputString));

		// Case 3
		System.out.println(Operation((so) -> {
			String result = "";
			for (int i = 0; i <= inputString.length() - 1; i++) {
				if (inputString.charAt(i) != ' ') {
					result = result + inputString.charAt(i);
				}
			}
			return result;
		}, inputString));

	}

}
