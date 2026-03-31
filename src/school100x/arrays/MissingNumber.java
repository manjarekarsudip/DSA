package school100x.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {

   /* You are given an integer array of size 𝑛, where 𝑛=2𝑚+1.

    In this array, exactly 𝑚 numbers appear twice, and exactly one number appears only once. Your task is to find and return that unique number.

    Input
    The first line contains a single integer 𝑡 (1≤𝑡≤100) — the number of test cases.
    Each test case consists of two lines:

    The first line contains a single integer 𝑛 (1≤𝑛≤1000, 𝑛 is always odd).
    The second line contains 𝑛 integers 𝑎1,𝑎2,…,𝑎𝑛 (1≤𝑎𝑖≤106) — the elements of the array.
    It is guaranteed that in each test case there is exactly one element that appears once, and all others appear exactly twice.

    Output
    For each test case, print a single integer, the unique element.
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
            int unique = findUnique(arr);
            System.out.println(unique);
        }
    }

    public static int findUnique(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }
        // If all pairs matched, the last one is unique
        return arr[arr.length - 1];
    }

}