import java.util.Arrays;

public class SquaresOfSortedArray {

	/*
	 * Given an integer array nums sorted in non-decreasing order, return an array
	 * of the squares of each number sorted in non-decreasing order.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100] Explanation: After
	 * squaring, the array becomes [16,1,0,9,100]. After sorting, it becomes
	 * [0,1,9,16,100]. Example 2:
	 * 
	 * Input: nums = [-7,-3,2,3,11] Output: [4,9,9,49,121]
	 */
	
	public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length ; i++){
            ans[i]=nums[i]*nums[i];
        }
        Arrays.sort(ans);
        return ans;
    }
	
	public int[] sortedSquares2(int[] nums) {

        int[] ans = new int[nums.length];
        int start = 0 ;
        int end = nums.length-1 ;
        int ptr = ans.length-1 ;

        while(start<=end){
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];
            if(ss>es){
                ans[ptr] = ss;
                start++;
            }else{
                ans[ptr] = es ;
                end--;
            }
            ptr--;
        }
        return ans ;
    }
}
