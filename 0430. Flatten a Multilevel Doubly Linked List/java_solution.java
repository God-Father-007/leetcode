/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        for( Node temp = head; temp != null; temp = temp.next ) {
            if( temp.child == null ) { continue; }
            Node child = temp.child;
            while( child.next != null ) { child = child.next; }
            child.next = temp.next;
            if( temp.next != null ) { temp.next.prev = child; }
            temp.next = temp.child;
            temp.child.prev = temp;
            temp.child = null;
        }
        return head;
    }
}