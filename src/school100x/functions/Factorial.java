package school100x.functions;

import java.util.Scanner;

public class Factorial {

   /* You are given an integer 𝑁

    Find the factorial of 𝑁 by writing a function that takes 𝑁 as a parameter and returns 𝑁!, where:
    𝑁!=1×2×3×⋯×𝑁*/

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);

    }

    public static void factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}