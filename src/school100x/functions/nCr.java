import java.util.Scanner;

public class nCr {

   /*You are given two integers 𝑛 and 𝑟
    Write a function to compute the binomial coefficient:
    
    (𝑛𝑟)=𝑛!/(𝑟!(𝑛−𝑟)!)
    */

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        coefficient(n, r);

    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void coefficient(int n, int r) {
        long nFactorial = factorial(n);
        long rFactorial = factorial(r);
        long diffFactorial = factorial(n - r);
        
        long result = nFactorial / (rFactorial * diffFactorial);
        System.out.println(result);
    }
}