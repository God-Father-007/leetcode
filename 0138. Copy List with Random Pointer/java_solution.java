/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    
    public Node copyListInPlace( Node head ) {
        if( head == null ) { return head; }
        
        Node curr = head;
        
        while( curr != null ) {
            Node frwd = curr.next;
            Node newNode = new Node(curr.val);
            curr.next = newNode;
            newNode.next = frwd;
            curr = frwd;
        }
        
        return head;
        
    }
    
    public Node copyRandoms( Node head ) {
        if( head == null ) { return head; }
        
        Node curr = head;
        while( curr != null ) {
            if( curr.random != null ) { curr.next.random = curr.random.next; }
            else { curr.next.random = null; }
            curr = curr.next.next;
        }
        
        return head;
    }
    
    public Node seperateCopiedList( Node head ) {
        if( head == null ) { return head; }
        
        Node curr = head;
        Node newHead = head.next;
        
        while( curr != null  ) {
            Node frwd = curr.next.next;
            if( frwd != null ) { curr.next.next = frwd.next; }
            else { curr.next.next = null; }
            curr.next = frwd;
            curr = frwd;
        }
        return newHead;
    }
    
    public Node copyRandomList(Node head) {
        if( head == null ) { return head; }
        head = copyListInPlace( head );
        head = copyRandoms( head );
        return seperateCopiedList( head );
        
    }
}