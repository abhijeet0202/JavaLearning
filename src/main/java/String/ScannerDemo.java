package String;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		String str = myScan.nextLine();
		String str1 = myScan.nextLine();
		System.out.print(str.trim().concat(str1.trim()));
		myScan.close();
	}

}
