/**
 * 
 */
package JavaLang;

import java.util.StringTokenizer;

/**
 * @author abhibane
 *
 */
final class StringTokenizerDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "Name: Abhijeet Banerjee,Company:Aricent,Designation:TechLead";
		
		StringTokenizer st = new StringTokenizer(str, ":,");
		
		while (st.hasMoreElements()){			
			System.out.println(st.nextToken()+ "\t\t"+st.nextToken());
			System.out.println(st.countTokens());
		}

	}

}
