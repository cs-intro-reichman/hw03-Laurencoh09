/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar1 {	
    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;     // 1.1.1900 was a Monday
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {
		int debugDaysCounter = 0;
		while (year <= 1999) { // Iterate through years until 1999
			advance();
			debugDaysCounter++;
			// You can add any specific conditions to stop the loop if needed.
		}
		// Additional code if necessary after the loop.
		System.out.println("Total number of days advanced: " + debugDaysCounter);
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {
		 dayOfMonth++;
		 dayOfWeek = (dayOfWeek % 7) + 1;
		 if(dayOfMonth > nDaysInMonth){
			 month++;
			 dayOfMonth = 1;
			 if(month > 12){
				 year++;
				 month = 1;
			 }
			 nDaysInMonth = nDaysInMonth(month, year);
		 }

		 System.out.print(dayOfMonth + ":");
		 System.out.print(month + ":");
		 System.out.print(year);
		 if (dayOfWeek == 1 && dayOfMonth == 1) {
			 System.out.println(" - Sunday");
		 } else {
			 System.out.println();
		 }

	 } 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	public static int nDaysInMonth(int month, int year) {
		if(month == 4 || month == 6 || month == 9 || month == 11){
			return 30;
		}
		else if (month == 2){
			if(isLeapYear(year) == true){
				return 29;
			}
			else{
				return 28;
			}
		}
		else{
			return 31;
		}

		
	}
}
