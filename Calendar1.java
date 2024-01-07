
public class Calendar1 {	
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int dayOfWeek = 2;    
	static int nDaysInMonth = 31; 
	public static void main(String args[]) {
		int debugDaysCounter = 0;
		while (year <= 1999) { 
			advance();
			debugDaysCounter++;
			
		}
	
		System.out.println("Total number of days advanced: " + debugDaysCounter);
	 }
	
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
	private static boolean isLeapYear(int year) {
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
