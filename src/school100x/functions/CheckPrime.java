package school100x.functions;

import java.util.Scanner;

public class CheckPrime {

   /* You are given an integer 𝑁

    Write a function that checks whether 𝑁 is a prime number.

    Print Prime if 𝑁 is prime, otherwise print Not Prime.*/

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrime(n);

    }

    public static void printPrime(int n) {
        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}