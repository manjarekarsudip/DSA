class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // 1. If we find the target, return its index immediately
            if (nums[mid] == target) {
                return mid;
            }
            
            // 2. Check if the left half is properly sorted
            if (nums[low] <= nums[mid]) {
                // Check if target lies within the sorted left boundaries
                if (target >= nums[low] && target < nums[mid]) {
                    high = mid - 1; // Search left
                } else {
                    low = mid + 1;  // Search right
                }
            } 
            // 3. Otherwise, the right half must be properly sorted
            else {
                // Check if target lies within the sorted right boundaries
                if (target > nums[mid] && target <= nums[high]) {
                    low = mid + 1;  // Search right
                } else {
                    high = mid - 1; // Search left
                }
            }
        }
        
        // Target was not found anywhere in the array
        return -1;

    }
}