package school100x.slidingWindowsAndTwoPointer;

import java.util.Scanner;

public class MaxSubarraySumOfSizeK {

   /* You are given an array 𝐴 of 𝑁 integers and an integer 𝐾.

    Your task is to find the maximum possible sum of any subarray of size exactly 𝐾.

    Input
    The first line contains two integers 𝑁 and 𝐾 (1≤𝐾≤𝑁≤10^5).

    The second line contains 𝑁 integers 𝐴1,𝐴2,…,𝐴𝑁 (−10^9≤𝐴𝑖≤10^9).

    Output
    Print a single integer — the maximum subarray sum of size 𝐾.
    */

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        maxSubarraySumOfSizeK(arr, k);
    }

    public static void maxSubarraySumOfSizeK(int[] arr, int k)
    {
        long maxSum = Long.MIN_VALUE;
        long currentSum = 0;
        
        // Calculate sum of first k elements
        for (int i = 0; i < k; i++) {
            currentSum += arr[i];
        }
        maxSum = currentSum;
        
        // Slide the window
        for (int i = k; i < arr.length; i++) {
            currentSum = currentSum - arr[i - k] + arr[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        
        System.out.println(maxSum);
    }
}