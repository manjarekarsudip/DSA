package school100x.arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IntersectionOfArrays {

   /* You have been given two integer arrays of size 𝑁 and 𝑀, respectively.
    You need to print their intersection.

    Input
    For each test case: The first line contains an integer 𝑁 (0≤𝑁≤1000), the size of the first array.
    The second line contains 𝑁 integers.
    The third line contains an integer 𝑀 (0≤𝑀≤1000), the size of second array.
    The fourth line contains 𝑀 integers.

    Output
    For each test case, print the intersection in one line. Elements must follow the order they 
    appear in the first array.
    */

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }
            int m = sc.nextInt();
            int[] arr2 = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = sc.nextInt();
            }
            printIntersection(arr1, arr2);
        }
        sc.close();
    }

    public static void printIntersection(int[] arr1, int[] arr2) {
        Map<Integer, Integer> freq2 = new HashMap<>();
        for (int num : arr2) {
            freq2.put(num, freq2.getOrDefault(num, 0) + 1);
        }
        for (int num : arr1) {
            if (freq2.getOrDefault(num, 0) > 0) {
                System.out.print(num + " ");
                freq2.put(num, freq2.get(num) - 1);
            }
        }
        System.out.println();
    }
}