
public class PalindromeNumber {

	public boolean isPalindrome(int x) {
        if(x<0){
        	System.out.println("Number "+x+" is not Palindrome");
            return false;
        }

        int n = x;
        int revNum = 0;
        
        while(n>0){
            int lastDigit = n%10;
            revNum = revNum*10 + lastDigit;
            n = n/10;
        }
        if(x == revNum){
        	System.out.println("Number "+x+" is Palindrome");
            return true;
        }
        else{
        	System.out.println("Number "+x+" is not Palindrome");
            return false;
        }
    }
	
	public static void main(String[] args) {
		PalindromeNumber palindromeNumber = new PalindromeNumber();
		palindromeNumber.isPalindrome(121);
	}

}
