package school100x.arrays;

import java.util.Scanner;

public class MinimumElementAndItsPosition {

   /* You are given an array of integers. Find the minimum element in the array and its position.
    If multiple positions contain the minimum value, print the smallest position.

    Input
    First line contains integer 𝑁 (1≤𝑁≤10^5) — size of the array.
    Second line contains 𝑁 integers 𝐴1,𝐴2,…,𝐴𝑁 (−10^9≤𝐴𝑖≤10^9).

    Output
    Print two integers — the minimum value and its position (1-based index).
    */

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        minimumElementAndItsPosition(arr);
    }

    public static void minimumElementAndItsPosition(int[] arr) {
        int minValue = Integer.MAX_VALUE;
        int minPosition = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                minPosition = i + 1; // 1-based index
            }
        }
        System.out.println(minValue + " " + minPosition);
    }
}