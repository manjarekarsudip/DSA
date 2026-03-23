package school100x.functions;

import java.util.Scanner;

public class CountZeros {

   /* You are given an integer 𝑁

    Find the number of digits equal to 0 in the decimal representation of 𝑁 by writing a function
    that takes 𝑁 as a parameter and returns the count of zero digits.

    Input
    The only line contains an integer 𝑁 (1≤𝑁≤10^18)

    Output
    Print a single integer — the count of zeros in 𝑁
*/

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        countZeros(n);

    }

    public static void countZeros(long n) {

        if (n == 0) {
            System.out.println(1);
            return;
        }
        int count = 0;
        while(n > 0){
            long digit = n % 10;
            if(digit == 0){
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}