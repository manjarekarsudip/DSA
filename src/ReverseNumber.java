public class ReverseNumber {

	public static void main(String[] args) {
		int num= 1234;
		//Approach 1
		/* 
		 * int rev=0; while(num!= 0){ int lastDig = num%10; num= num/10; rev = rev*10 +
		 * lastDig; } System.out.println("Rev Num : "+rev);
		 */
		//Approach 2
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		StringBuffer reverse = sb.reverse();
		System.out.println("Reverse Num : "+reverse);

	}
}
