public class DoubleANumberRepresentedAsLinkedList {
	/*
	 * You are given the head of a non-empty linked list representing a non-negative
	 * integer without leading zeroes.
	 * 
	 * Return the head of the linked list after doubling it.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * 
	 * Input: head = [1,8,9] Output: [3,7,8] Explanation: The figure above
	 * corresponds to the given linked list which represents the number 189. Hence,
	 * the returned linked list represents the number 189 * 2 = 378. Example 2:
	 * 
	 * 
	 * Input: head = [9,9,9] Output: [1,9,9,8] Explanation: The figure above
	 * corresponds to the given linked list which represents the number 999. Hence,
	 * the returned linked list reprersents the number 999 * 2 = 1998.
	 * 
	 * 
	 * Constraints:
	 * 
	 * The number of nodes in the list is in the range [1, 104] 0 <= Node.val <= 9
	 * The input is generated such that the list represents a number that does not
	 * have leading zeros, except the number 0 itself.
	 * 
	 * public
	 */ 
	class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }

	public ListNode reverseLL(ListNode head) {
        
		ListNode curr = head;
		ListNode pre = null;
		
		while(curr!=null) {
			ListNode temp = curr.next;
			curr.next=pre;
			pre = curr;
			curr = temp;
		}
		return pre;
    }
	public ListNode doubleIt(ListNode head) {
        
		ListNode nhead = reverseLL(head);
		ListNode dummy = new ListNode(-1);
		ListNode ans = dummy;
		int carry = 0;
		
		while(nhead != null) {
			int sum = nhead.val + nhead.val + carry; 
			int d = sum%10;
			carry = sum/10;
			
			ListNode temp = new ListNode(d);
			dummy.next=temp;
			dummy = dummy.next;
			nhead=nhead.next;
		}
		if(carry>0) {
			ListNode temp = new ListNode(carry);
			dummy.next = temp;
			dummy = dummy.next;
		}
		ans = reverseLL(ans.next);
		return ans;
    }
}
