package school100x.arrays;

import java.util.Scanner;

public class SumOfArray {

   /* You are given an array of integers. Find the sum of all elements of the array.

    Input
    First line contains integer 𝑁 (1≤𝑁≤10^5) — size of the array.
    Second line contains 𝑁 integers 𝐴1,𝐴2,…,𝐴𝑁 (−10^9≤𝐴𝑖≤10^9).

    Output
    Print a single integer — the sum of the array elements.
    */

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sumOfArray(arr);
    }

    public static void sumOfArray(int[] arr) {
        long sum = 0;
        for (long a : arr) {
            sum += a;
        }
        System.out.println(sum);
    }
}