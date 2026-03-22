public class HelloFunctions {

    /*
    Hello Functions
    You are given an integer 𝑁

    Write a function that takes 𝑁
    as a parameter and prints the string I am learning functions exactly 𝑁
    times, each on a new line.

            Input
    The only line contains an integer 𝑁 (1≤𝑁≤1000).

    Output
    Print 𝑁 lines. Each line must be exactly:

    I am learning functions
    */

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printStatement(n);

    }

    public static void printStatement(int n){
        for(int i=0; i<n ; i++){
            System.out.println("I am learning functions");
        }
    }
}