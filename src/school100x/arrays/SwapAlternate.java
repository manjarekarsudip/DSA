package school100x.arrays;

import java.util.Scanner;

public class SwapAlternate {

   /* You are given an array 𝐴 of size 𝑛. Your task is to swap every pair of alternate elements in the array.

    Input
    The first line contains a single integer 𝑡 (1≤𝑡≤100) — the number of test cases.
    Each test case consists of two lines:

    The first line contains an integer 𝑛 (0≤𝑛≤10^5) — the size of the array.
    The second line contains 𝑛 integers 𝑎1,𝑎2,…,𝑎𝑛 (1≤𝑎𝑖≤10^9).
    It is guaranteed that the sum of 𝑛 over all test cases does not exceed 105.

    Output
    For each test case, print the modified array after performing all swaps.
    */

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            swapAlternate(arr);
            // Print the modified array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    public static void swapAlternate(int[] arr) {
        for (int j = 1; j < arr.length; j += 2) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
        }
    }

}