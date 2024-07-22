public class FindTheDuplicateNumber {

	/*
	 * Given an array of integers nums containing n + 1 integers where each integer
	 * is in the range [1, n] inclusive.
	 * 
	 * There is only one repeated number in nums, return this repeated number.
	 * 
	 * You must solve the problem without modifying the array nums and uses only
	 * constant extra space.
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,3,4,2,2] Output: 2
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [3,1,3,4,2] Output: 3
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [3,3,3,3,3] Output: 3
	 */

public int findDuplicate(int[] nums) {
        
        //Brute Force
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i] == nums[j]){
        //         return nums[i];
        //         }
        //     }
        // }        
        // return -1;

        //Sort the array and check adjacent elements
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i] == nums[i+1]){
        //         return nums[i];
        //     }
        // }
        // return -1;

        //Using HashSet to store visited nodes
        // Set<Integer> set = new HashSet();
        // for(int i=0;i<nums.length;i++) {
        //     if(set.contains(nums[i])){
        //         return nums[i];
        //     }
        //     set.add(nums[i]);
        // }
        // return -1;

        //Mark visited element negative
        for(int i=0;i<nums.length;i++) {
            int ind = Math.abs(nums[i]);
            if(nums[ind] < 0) {
                return ind;
            }
            nums[ind] = -nums[ind];
        }
        return -1;
    }
}
