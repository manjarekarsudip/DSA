import java.util.Stack;

public class MinimumAddToMakeParenthesesValid {

	/*
	 * A parentheses string is valid if and only if:
	 * 
	 * It is the empty string, It can be written as AB (A concatenated with B),
	 * where A and B are valid strings, or It can be written as (A), where A is a
	 * valid string. You are given a parentheses string s. In one move, you can
	 * insert a parenthesis at any position of the string.
	 * 
	 * For example, if s = "()))", you can insert an opening parenthesis to be
	 * "(()))" or a closing parenthesis to be "())))". Return the minimum number of
	 * moves required to make s valid.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "())" Output: 1 Example 2:
	 * 
	 * Input: s = "(((" Output: 3
	 */
	
	public int minAddToMakeValid(String s) {
    
		Stack<Character> st = new Stack<Character>();
		int count = 0;
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch=='(') {
				st.push(ch);
			}
			else if(st.size()>0 && st.peek()=='(') {
				st.pop();
			}
			else {
				count++;
			}
		}
		return st.size()+count;
    }
}
