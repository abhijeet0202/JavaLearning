package Programs;

import java.util.Scanner;

public class PrintSeriesBasedOnInput {

	public static void printSeries() {
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();

		String str = new String();
		for (int i = input; i > 0; i--) {
			str = str + "9";
		}
		int series = Integer.valueOf(str);

		for (int i = 1; i <= series; i++) {
			System.out.print("0" + i + "-->");
			if (i%10==0) {
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		PrintSeriesBasedOnInput.printSeries();

	}

}
