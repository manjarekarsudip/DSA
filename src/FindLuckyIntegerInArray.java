import java.util.HashMap;
import java.util.Iterator;

public class FindLuckyIntegerInArray {

	/*
	 * Given an array of integers arr, a lucky integer is an integer that has a
	 * frequency in the array equal to its value.
	 * 
	 * Return the largest lucky integer in the array. If there is no lucky integer
	 * return -1.
	 * 
	 * Example 1:
	 * 
	 * Input: arr = [2,2,3,4] Output: 2 Explanation: The only lucky number in the
	 * array is 2 because frequency[2] == 2. Example 2:
	 * 
	 * Input: arr = [1,2,2,3,3,3] Output: 3 Explanation: 1, 2 and 3 are all lucky
	 * numbers, return the largest of them. Example 3:
	 * 
	 * Input: arr = [2,2,2,3,3] Output: -1 Explanation: There are no lucky numbers
	 * in the array.
	 */
	
	public static int findLucky(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			int ele = arr[i];
			if(hm.containsKey(ele)==true) {
				hm.put(ele, hm.get(ele)+1);
			}
			else {
				hm.put(ele, 1);
			}
		}
		int ans = -1;
		
		for (int key : hm.keySet()) {
			if(key==hm.get(key)) {
				ans = Math.max(ans, key);
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] arr = {1,2,2,3,3,3};
		int findLucky = findLucky(arr);
		System.out.println(findLucky);
	}
}
