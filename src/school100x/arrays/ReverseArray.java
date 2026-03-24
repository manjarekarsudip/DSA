package school100x.arrays;

import java.util.Scanner;

public class ReverseArray {

   /* You are given an array of integers. Print the elements of the array in reverse order.

    Input
    First line contains integer 𝑁 (1≤𝑁≤10^5) — size of the array.
    Second line contains 𝑁 integers 𝐴1,𝐴2,…,𝐴𝑁 (−10^9≤𝐴𝑖≤10^9).

    Output
    Print the elements of the array in reverse order.
    */

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
    }

    public static void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}