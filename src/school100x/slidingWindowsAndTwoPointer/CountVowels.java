package school100x.slidingWindowsAndTwoPointer;

import java.util.Scanner;

public class CountVowels {

   /* You are given a string 𝑆 of length 𝑁 consisting of uppercase and lowercase English letters.
    You are also given an integer 𝐾.

    For every substring of length 𝐾, compute the number of vowels in that substring.

    Input
    The first line contains two integers 𝑁 and 𝐾 (1≤𝐾≤𝑁≤10^5).

    The second line contains the string 𝑆.

    Output
    Print 𝑁−𝐾+1 integers — the number of vowels in each substring of length 𝐾
    */

    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        sc.close();
        countVowelsInSubstrings(s, k);
    }

    public static void countVowelsInSubstrings(String s, int k) {
        int[] result = new int[s.length() - k + 1];
        int vowelCount = 0;
        
        // Count vowels in the first window
        for (int i = 0; i < k; i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
        }
        result[0] = vowelCount;
        
        // Slide the window
        for (int i = k; i < s.length(); i++) {
            char out = Character.toLowerCase(s.charAt(i - k));
            if (out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u') {
                vowelCount--;
            }
            char in = Character.toLowerCase(s.charAt(i));
            if (in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u') {
                vowelCount++;
            }
            result[i - k + 1] = vowelCount;
        }
        
        // Print the results
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}