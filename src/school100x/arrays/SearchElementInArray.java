package school100x.arrays;

import java.util.Scanner;

public class SearchElementInArray {

   /* Given an array of integers and a value 𝑋, determine whether 𝑋 is present in the array.

    Print "YES" if it is present, otherwise print "NO".

    Input
    First line contains two integers 𝑁 and 𝑋 (1≤𝑁≤10^5,−10^9≤𝑋≤10^9)

    Second line contains 𝑁 integers 𝐴1,𝐴2,…,𝐴𝑁 (−10^9≤𝐴𝑖≤10^9).

    Output
    Print "YES" if 𝑋 is present in the array, otherwise print "NO".
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

        searchElement(arr, target);
    }

    public static void searchElement(int[] arr, int target) {
        boolean targetFound = false;
        for ( int i = 0; i< arr.length; i++) {
            if(arr[i] == target) {
                targetFound = true;
                break;
            }
        }
        if(targetFound) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}