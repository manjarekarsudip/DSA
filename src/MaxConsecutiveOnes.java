public class MaxConsecutiveOnes {

	/*
	 * Given a binary array nums, return the maximum number of consecutive 1's in
	 * the array.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or
	 * the last three digits are consecutive 1s. The maximum number of consecutive
	 * 1s is 3.
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [1,0,1,1,0,1] Output: 2
	 */
	
	public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;
        
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
            } else {
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }
        
        // Final check to handle the case where the array ends with a streak of 1s
        maxCount = Math.max(maxCount, currentCount);
        
        return maxCount;
    }
}
