import java.util.Stack;

public class RemoveDuplicateLetters {

	/*
	 * Given a string s, remove duplicate letters so that every letter appears once
	 * and only once. You must make sure your result is the smallest in
	 * lexicographical order among all possible results.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "bcabc" Output: "abc" Example 2:
	 * 
	 * Input: s = "cbacdcbc" Output: "acdb"
	 */

	public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int) (ch - 'a');

            lastIndex[idx] = i;
        }

        boolean[] present = new boolean[26];

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int) (ch - 'a');

            if (present[idx] == false) {
                while (st.size() > 0 && st.peek() > ch && lastIndex[(int) (st.peek() - 'a')] > i) {
                    present[(int) (st.peek() - 'a')] = false;
                    st.pop();
                }

                st.push(ch);
                present[idx] = true;
            }
        }

        StringBuilder sb = new StringBuilder("");

        while (st.size() > 0) {
            sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
