/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    private ListNode findMidNode( ListNode head ) {
        
        ListNode slow = head;
        ListNode fast = head;
        
        while( fast.next != null && fast.next.next != null ) {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        return slow;
        
    }
    
    private ListNode reverseList(ListNode head) {
        
        if( head == null || head.next == null ) { return head; }
        
        ListNode prev = null;
        ListNode curr = head;
        
        while(curr != null) {
            ListNode frwd = curr.next;
            
            curr.next = prev;
            prev = curr;
            curr = frwd;
            if( frwd != null ) { frwd = frwd.next; }
        }
        
        return prev;
        
    }
    
    private boolean compare( ListNode l1, ListNode l2 ) {
        
        if( l1 == null || l2 == null ) { return false; }
        
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;
        
        while( pointer1 != null && pointer2 != null ) {
            if( pointer1.val != pointer2.val ) { return false; }
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }
        return true;
        
    }
    
    public boolean isPalindrome(ListNode head) {
        
        if( head == null || head.next == null ) { return true; }
        
        ListNode midNode = findMidNode( head );
        ListNode newHead = midNode.next;
        midNode.next = null;
        newHead = reverseList( newHead );
        
        Boolean isPal = compare( head, newHead );
        
        newHead = reverseList( newHead );
        midNode.next = newHead;
        
        return isPal;
        
    }
}













