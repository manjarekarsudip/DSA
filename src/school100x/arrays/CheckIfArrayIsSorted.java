package school100x.arrays;

import java.util.Scanner;

public class CheckIfArrayIsSorted {

   /* You are given an array of integers. determine whether it is sorted in ascending order.

    Input
    An array 𝐴1,𝐴2,…,𝐴𝑁 is sorted in ascending order if 𝐴𝑖≤𝐴𝑖+1 for all 1≤𝑖<𝑁

    Output
    Print YES if the array is sorted in ascending order, otherwise print NO.
    */

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        checkIfArrayIsSorted(arr);
    }

    public static void checkIfArrayIsSorted(int[] arr) {
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("YES");
        }  else {
            System.out.println("NO");
        }
    }
}