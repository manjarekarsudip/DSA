import java.util.HashMap;

public class ValidAnagram {

	/*
	 * Given two strings s and t, return true if t is an anagram of s, and false
	 * otherwise.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: s = "anagram", t = "nagaram"
	 * 
	 * Output: true
	 * 
	 * Example 2:
	 * 
	 * Input: s = "rat", t = "car"
	 * 
	 * Output: false
	 */

	public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
        	char ch = s.charAt(i);
        	
			if(hm.containsKey(ch)==true) {
				hm.put(ch, hm.get(ch)+1);
			}else {
				hm.put(ch, 1);
			}
		}
        
        for (int i = 0; i < t.length(); i++) {
        	char ch = t.charAt(i);
        	
			if(hm.containsKey(ch)==true) {
				if(hm.get(ch)==1) {
					hm.remove(ch);
				}else {
					hm.put(ch, hm.get(ch)-1);
				}
			}else {
				return false;			}
		}

        if(hm.size()==0) {
        	return true;
        }else {
        	return false;
        }
    }
}
