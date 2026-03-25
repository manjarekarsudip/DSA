package school100x.arrays;

import java.util.Scanner;

public class Sort01 {

   /* You have been given an integer array of size 𝑁 that contains only integers 0 and 1
    Print the sorted array of 01.

    Input
    1≤𝑡≤10^2
    0≤𝑁≤10^5

    Output
    Print the expected array.
    */

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sort01(arr);
    }

    public static void sort01(int[] arr) {
        int countZero = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countZero++;
            }
        }
        for (int i = 0; i < countZero; i++) {
            System.out.print(0 + " ");
        }
        for (int i = countZero; i < arr.length; i++) {
            System.out.print(1 + " ");
        }
    }
}