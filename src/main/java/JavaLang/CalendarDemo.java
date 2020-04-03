/**
 * 
 */
package JavaLang;

import java.util.Calendar;

/**
 * @author abhibane
 *
 */
final class CalendarDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		String months[] = {
				"Jan", "Feb", "Mar", "Apr",
				"May", "Jun", "Jul", "Aug",
				"Sep", "Oct", "Nov", "Dec"};
				// Create a calendar initialized with the
				// current date and time in the default
				// locale and timezone.
		
				// Display current time and date information.
				System.out.print("Date: ");
				System.out.print(months[calendar.get(Calendar.MONTH)]);
				System.out.print(" " + calendar.get(Calendar.DATE) + " ");
				System.out.println(calendar.get(Calendar.YEAR));
				System.out.print("Time: ");
				System.out.print(calendar.get(Calendar.HOUR) + ":");
				System.out.print(calendar.get(Calendar.MINUTE) + ":");
				System.out.println(calendar.get(Calendar.SECOND));
	}

}
