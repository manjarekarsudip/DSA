package school100x.arrays;

import java.util.Scanner;

public class ArrangeTheNumbers {

   /* You are given a single integer 𝑛. Construct an array of length 𝑛 containing the integers from 1 to 𝑛
    (each exactly once) in the following order:

    1,3,5,… (increasing order from the left)
    2,4,6,… (decreasing order from the right)

    Input
    The first line contains a single integer 𝑡 (1≤𝑡≤100) — the number of test cases.
    Each of the next 𝑡 lines contains a single integer 𝑛 (1≤𝑛≤10^4).

    Output
    Print 𝑛 integers — the required array.
    */

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int test = 0; test < t; test++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int index = 0;
            // Add odd numbers in increasing order
            for (int i = 1; i <= n; i += 2) {
                arr[index++] = i;
            }
            // Add even numbers in decreasing order
            for (int i = (n % 2 == 0 ? n : n - 1); i >= 2; i -= 2) {
                arr[index++] = i;
            }
            // Print the array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

}