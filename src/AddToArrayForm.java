import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddToArrayForm {

	/*
	 * The array-form of an integer num is an array representing its digits in left
	 * to right order.
	 * 
	 * For example, for num = 1321, the array form is [1,3,2,1]. Given num, the
	 * array-form of an integer, and an integer k, return the array-form of the
	 * integer num + k.
	 * 
	 * Example 1:
	 * 
	 * Input: num = [1,2,0,0], k = 34 Output: [1,2,3,4] Explanation: 1200 + 34 =
	 * 1234 Example 2:
	 * 
	 * Input: num = [2,7,4], k = 181 Output: [4,5,5] Explanation: 274 + 181 = 455
	 * Example 3:
	 * 
	 * Input: num = [2,1,5], k = 806 Output: [1,0,2,1] Explanation: 215 + 806 = 1021
	 */
	
	public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList();
        int p =num.length -1;
        int carry = 0;
        while(p>=0 || k>0){
            int numVal = 0;                         //int[] num --> numVal
            if(p>=0){
                numVal = num[p];
            }
            int lastDigit = k%10;                   //operation for lastDigit of k
            int sum = numVal + lastDigit + carry;
            int digit = sum%10;                     
            carry = sum/10;                         //Removal of last digit of sum which will be used in -->ans
            ans.add(digit);
            p--;
            k=k/10;                                 //Removal of last digit from k
        }
        if(carry>0){
            ans.add(carry);                         //To add the carried Num in --> ans
        }
        Collections.reverse(ans);                   
        return ans;
    }
}
