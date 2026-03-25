package school100x.arrays;

import java.util.Scanner;

public class CountOccurrences {

   /* Given an array of integers and a value 𝑋, Find how many times 𝑋 appears in the array.

    Input
    First line contains two integers 𝑁 and 𝑋 (1≤𝑁≤10^5,−10^9≤𝑋≤10^9)

    Second line contains 𝑁 integers 𝐴1,𝐴2,…,𝐴𝑁 (−10^9≤𝐴𝑖≤10^9).

    Output
    Print a single integer — the number of times 𝑋 appears in the array.
    */

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        countOccurances(arr, target);
    }

    public static void countOccurances(int[] arr, int target) {
        int count = 0;
        for ( int i = 0; i< arr.length; i++) {
            if(arr[i] == target) {
                count++;
            }
        }
        System.out.println(count);
    }
}