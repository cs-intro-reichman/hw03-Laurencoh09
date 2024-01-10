
public class Calendar0 {	
	public static void main(String args[]) {
		int year = Integer.parseInt(args[0]);
		isLeapYearTest(year);
		nDaysInMonthTest(year);
	}
		 
	
	private static void isLeapYearTest(int year) {
		String commonOrLeap = "common";
		if (isLeapYear(year)) {
			commonOrLeap = "leap";
		}
		System.out.println(year + " is a " + commonOrLeap + " year");  
	}

	// Tests the nDaysInMonth function.
	private static void nDaysInMonthTest(int year) {
		for(int month = 1; month <= 12; month ++){
			int daysInMonth = nDaysInMonth(month, year);
			System.out.println("Month " + month + " has " + daysInMonth + " daysInMonth");
		}

	}

	// Returns true if the given year is a leap year, false otherwise.
	public static boolean isLeapYear(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
			return true;
		}
		else {
			return false;
		}
	}
	 

	public static int nDaysInMonth(int month, int year) {
		if(month == 4 || month == 6 || month == 9 || month == 11){
			return 30;
		}
		else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			return 31;
		}
		else if (month == 2)
		{
			if (isLeapYear(year))
			return 29;
		}
		return 28;
		
	}
}
