/**
 * 
 */
package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.UUID;

/**
 * @author abhibane
 *
 */

public class Hello {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		ClassNumClass<Number> n1 = new 
//				Integer
//		byte x = 1;
//		double y = 2.2;
//		// getFactor(x,y);
//		// getGUID();
//		//basicProgram();
//		
//		String s = "what";
//		StringBuffer sb = new StringBuffer("what");
//		System.out.println(sb.equals(s));
//		System.out.println(s.equals(sb));
		
		LinkedList<String> lla = new LinkedList<String>();
		LinkedList<String> llb = new LinkedList<String>();
		assert lla.size() == llb.size() : "empty";
		lla.add("Hello");
		assert lla.size() == 1: "size";
		
		llb.add("Hello");
		assert lla.contains("Hello") : "contains";
		
		assert lla.get(0).equals(llb.get(0)): "element";
		assert lla.equals(llb): "collections";
		
	}

	/*
	 * public static double getFactor(byte x, double y) { return (long) x / y * 3; }
	 * 
	 * public static void getGUID() { try {
	 * 
	 * File file = new File("out.txt"); FileOutputStream fos = new
	 * FileOutputStream(file); PrintStream ps = new PrintStream(fos);
	 * System.setOut(ps); for (int i = 0; i < 200000; i++)
	 * System.out.println(UUID.randomUUID()); } catch (FileNotFoundException ex) { }
	 * }
	 * 
	 * public static void basicProgram() {
	 * 
	 * Scanner scan = new Scanner(System.in); String str = scan.nextLine(); boolean
	 * flag = true; String word = null;
	 * 
	 * for (int i = 0; i < str.length() && flag;) { int spaceindex =
	 * str.indexOf(" ", i); if (spaceindex == -1) { word = str.substring(i); i =
	 * str.length(); }else { word = str.substring(i, spaceindex); i = spaceindex+1;
	 * }
	 * 
	 * for (int j = 0; j < word.length(); j++) { if ((j != 0) &&
	 * Character.isUpperCase(word.charAt(j))) { flag = false; break; } else { if ((j
	 * == 0) && Character.isLowerCase(word.charAt(j))) { flag = false; break; } } }
	 * } if (flag) { System.out.print("True"); } else System.out.print("False");
	 * scan.close(); }
	 */
}
