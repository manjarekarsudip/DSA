public class DuplicateZeros {

	/*
	 * Given a fixed-length integer array arr, duplicate each occurrence of zero,
	 * shifting the remaining elements to the right.
	 * 
	 * Note that elements beyond the length of the original array are not written.
	 * Do the above modifications to the input array in place and do not return
	 * anything.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: arr = [1,0,2,3,0,4,5,0] Output: [1,0,0,2,3,0,0,4] Explanation: After
	 * calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]
	 * Example 2:
	 * 
	 * Input: arr = [1,2,3] Output: [1,2,3] Explanation: After calling your
	 * function, the input array is modified to: [1,2,3]
	 * 
	 */
	public static void main(String[] args) {
		int [] arr = {1,0,2,3,0,4,5,0};
		DuplicateZeros d = new DuplicateZeros();
		d.duplicateZeros(arr);
	} 

	public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] newArr = new int[n];
        int j = 0;

        // Iterate through the original array
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                if (j < n) {
                    newArr[j++] = 0; // Duplicate the zero
                }
                if (j < n) {
                    newArr[j++] = 0; // Add the second zero
                }
            } else {
                if (j < n) {
                    newArr[j++] = arr[i]; // Copy the original element
                }
            }
        }

        // Copy the new array back to the original array
        for (int i = 0; i < n; i++) {
            arr[i] = newArr[i];
        }
    }
}
