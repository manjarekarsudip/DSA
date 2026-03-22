package school100x.functions;

import java.util.Scanner;

public class PrintFactorsII {

    /*You are given an integer 𝑁.

    Write a function that prints all factors of 𝑁 in decreasing order.

    Print all factors of 𝑁
    in decreasing order, separated by single spaces.*/

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactors(n);

    }
    
    public static void printFactors(int n){
        for(int i=n; i>=1 ; i--){
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
}