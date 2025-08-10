public class LeapYear {

	public static void main(String[] args) {
		
		findLeapYear(2300);
	}
	
	public static void findLeapYear(Integer year) {
		
		if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println(year + " is a Leap Year");
                } else {
                    System.out.println(year + " is Not a Leap Year");
                }
            } else {
                System.out.println(year + " is a Leap Year");
            }
        } else {
            System.out.println(year + " is Not a Leap Year");
        }
	}
}
