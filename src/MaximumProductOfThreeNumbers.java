import java.util.Arrays;

public class MaximumProductOfThreeNumbers {

	/*
	 * Given an integer array nums, find three numbers whose product is maximum and
	 * return the maximum product.
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,3] Output: 6 Example 2:
	 * 
	 * Input: nums = [1,2,3,4] Output: 24 Example 3:
	 * 
	 * Input: nums = [-1,-2,-3] Output: -6
	 */
	
	public int maximumProduct(int[] nums) {
        int max = 0;
        Arrays.sort(nums);
        int n = nums.length-1;

        int case1 = nums[0] * nums[1] * nums[n];
        int case2 = nums[n] * nums[(n-1)] * nums[(n-2)];

        max = Math.max(case1, case2);
        return max;
    }
}
