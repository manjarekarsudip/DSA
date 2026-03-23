import java.util.Scanner;

public class PrintPrimesFrom1toN {

   /* You are given an integer 𝑁

    Print all prime numbers from 1 to 𝑁  in increasing order by writing a function that takes 𝑁 
    as a parameter and prints the required primes.

    Input
    The only line contains an integer 𝑁 (1≤𝑁≤10^5)

    Output
    Print all prime numbers from 1 to 𝑁 in increasing order, separated by single spaces.
*/

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrime(n);

    }

    public static void printPrime(int n) {
        
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}