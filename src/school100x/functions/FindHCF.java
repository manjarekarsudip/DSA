package school100x.functions;

import java.util.Scanner;

public class FindHCF {

   /* You are given an integer 𝑁

    You are given two integers 𝐴 and 𝐵.
    Find the HCF of 𝐴 and 𝐵 by writing a function that takes 𝐴 and 𝐵 as parameters and returns their HCF.

    Input
    The only line contains two integers 𝐴 and 𝐵 (1≤𝐴,𝐵≤10^5).

    Output
    Print the HCF of 𝐴 and 𝐵
*/

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        findHCF(a,b);

    }

    public static void findHCF(int a, int b) {

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);
    }
}