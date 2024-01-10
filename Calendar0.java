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
	private static void nDaysInMonthTest(int year) {
		for(int month = 1; month <= 12; month ++){
			int daysInMonth = nDaysInMonth(month, year);
			System.out.println("Month " + month + " has " + daysInMonth + " daysInMonth");
		}

	}

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
