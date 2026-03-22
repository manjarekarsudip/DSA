import java.util.Scanner;

public class PrintFactorsI {

   /* You are given an integer 𝑁

    Write a function that prints all factors of 𝑁 in increasing order.

    Input
    The only line contains an integer 𝑁 (1≤𝑁≤10^5)

    Output
    Print all factors of 𝑁 in increasing order, separated by single spaces.*/

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactors(n);

    }

    public static void printFactors(int n) {
        for (int i = 1; i <= n; i++) {
            // Check if i divides n perfectly
            if (n % i == 0) {
                System.out.print(i + " ");

            }
        }
        // Print a new line after all factors are displayed
        System.out.println();
    }
}