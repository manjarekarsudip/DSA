import java.util.Stack;

public class PalindromeLinkedList {

	/*
	 * Given the head of a singly linked list, return true if it is a palindrome or
	 * false otherwise.
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: head = [1,2,2,1] Output: true Example 2:
	 * 
	 * 
	 * Input: head = [1,2] Output: false
	 * 
	 * 
	 * Constraints:
	 * 
	 * The number of nodes in the list is in the range [1, 105]. 0 <= Node.val <= 9
	 */

	  public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	
	public boolean isPalindrome(ListNode head) {
	        
		Stack<Integer> st = new Stack<Integer>();
		
		ListNode ptr = head;
		while(ptr != null) {
			st.push(ptr.val);
			ptr = ptr.next;
		}
		
		ListNode ptr2 = head;
		while(ptr2 != null) {
			int val1 = ptr2.val;
			int val2 = st.pop();
			
			if(val1 != val2) {
				return false;
			}
			ptr2 = ptr2.next;
		}
		return true;
	}
}
