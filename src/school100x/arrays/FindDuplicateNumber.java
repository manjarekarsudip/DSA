package school100x.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FindDuplicateNumber {

   /* You have been given an integer array of size 𝑁 which contains numbers from 0 to (𝑁−2).
    Each number is present at least once. Among these, there is a single integer value that is present twice

    You need to find the duplicate number present in the array.

    Input
    The first line contains a single integer 𝑡 (1≤𝑡≤100) — the number of test cases.
    Each test case consists of two lines:

    The first line contains a single integer 𝑛 (1≤𝑛≤1000, 𝑛 is always odd).
    The second line contains 𝑁 integers representing the array/list.

    Output
    For each test case, print the duplicate number in the array.
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
            int duplicate = findDuplicate(arr);
            System.out.println(duplicate);
        }
    }

    public static int findDuplicate(int[] arr)
    {
        int n = arr.length;
        int[] freq = new int[n - 1]; // Indices 0 to n-2
        for (int num : arr) {
            freq[num]++;
            if (freq[num] == 2) {
                return num;
            }
        }
        return -1; // Should not reach here
    }

}