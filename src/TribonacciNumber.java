public class TribonacciNumber {

	/*
	 * The Tribonacci sequence Tn is defined as follows:
	 * 
	 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
	 * 
	 * Given n, return the value of Tn.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: n = 4 Output: 4 Explanation: T_3 = 0 + 1 + 1 = 2 T_4 = 1 + 1 + 2 = 4
	 * Example 2:
	 * 
	 * Input: n = 25 Output: 1389537
	 */
	
	public int tribonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1 || n==2){
            return 1;
        }
        int firstTerm=0;
        int secondTerm=1;
        int thirdTerm=1;
        for(int i=1; i<=n; i++){
            int nextTerm = firstTerm + secondTerm + thirdTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
            thirdTerm = nextTerm;
        }
        return firstTerm;
    }
}
