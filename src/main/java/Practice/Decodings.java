package Practice;

import java.math.BigInteger;

class Decodings {

	private BigInteger count(String input, int index, int length) {

		if (index >= length) {
			return BigInteger.valueOf(1);
		} else {

			BigInteger sum = count(input, index + 1, length);

			if (index + 1 <= length) {

				int twoDigit = Integer.parseInt(input.substring(index, index + 2));
				if (twoDigit <= 26) {
					sum = sum.add(count(input, index + 2, length));
				}
			}

			return sum;
		}
	}

	public String countDecodings(String input1) {

		if (input1.isEmpty() || input1.charAt(0)== '0')
			throw new NullPointerException();
		
		return String.valueOf(count(input1, 0, input1.length() - 1));
	}

	public static void main(String[] args) throws java.lang.Exception {
		//String result = new Decodings().countDecodings("1265");
		//System.out.println(result);
		
		System.out.printf("My anme is %s and age is %s", "Abhijeet", 24);
	}
}
