/**
 * 
 */
package JavaLang;

import java.util.Date;

/**
 * @author abhibane
 *
 */
final class DateDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.getTime()+"\n"+date.getDate()+"\n"+date.getMonth()+"\n"+date.getYear()+"\n"+date);
	}

}
