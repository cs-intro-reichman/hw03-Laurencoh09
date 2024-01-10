public class Calendar {	
		// Starting the calendar on 1/1/1900
		static int dayOfMonth = 1;   
		static int month = 1;
		static int year = 1900;
		static int dayOfWeek = 2;     
		static int nDaysInMonth = 31; 
		
		public static void main(String args[]) {
		int whichYear = Integer.parseInt(args[0]);

			int debugDaysCounter = 0;

			while (year < whichYear)
				advance();
			while (year == whichYear) {
						
				if(dayOfWeek == 1){
					System.out.println(dayOfMonth + "/" + month + "/" + year + " Sunday");
				}
				else{
					System.out.println(dayOfMonth + "/" + month + "/" + year);
				}

				
				advance();	 
				debugDaysCounter++;
				
				if (false) { 
					break;
				}

			}
			//// Write the necessary ending code here
		 }
		 private static void advance() {
			
			if(dayOfWeek == 7) dayOfWeek = 1;
			else dayOfWeek++;
			if(dayOfMonth == nDaysInMonth(month, year)){
				if(month == 12) {
					month = 1;
					year++;
					dayOfMonth = 1;
				}
				else{
					month++;
					dayOfMonth = 1;
				}
			}
			else{
				dayOfMonth++;
		 } 
		 }	 
		 
		private static boolean isLeapYear(int year) {
		
			boolean isLeap;
			isLeap = ((year % 400) == 0);
			isLeap = isLeap || (((year % 4) == 0) && ((year % 100) != 0));
			return isLeap;
		}
		 
		private static int nDaysInMonth(int month, int year) {
			// Replace the following statement with your code
			if(month == 4 || month == 6 || month == 9 || month ==11) return 30;
			if(month == 1 || month == 3 || month == 4 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) return 31;
			if(month == 2){
				if(isLeapYear(year)) return 29;
				else return 28;
			}
			else return 0;

      
		}
	}
