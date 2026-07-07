class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            // Finding the mid point safely to prevent integer overflow
            int mid = (high + low) / 2;
            
            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                low = mid + 1; // Eliminate the left half
            } else {
                high = mid - 1; // Eliminate the right half
            }
        }
        
        return -1; // Target does not exist in the array
    }
}