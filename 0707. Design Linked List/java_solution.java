class MyLinkedList {
    class Node{
        int val;
        Node next;
        public Node( int val ) { this.val = val; }
        public Node( int val, Node next ) {
            this.val = val;
            this.next = next;
        }
    }

    Node head;
    int size;
    public MyLinkedList() {
        this.head = new Node( -1 );
        this.size = 0;
    }
    
    public int get(int index) {
        if( index < 0 || index >= size ) { return -1; }
        Node n = head.next;
       while( index > 0 ) {
           n = n.next; index--;
       }
       return n.val;
    }
    
    public void addAtHead(int val) {
        addAtIndex(0, val);
    }
    
    public void addAtTail(int val) {
        addAtIndex(size, val);
    }
    
    public void addAtIndex(int index, int val) {
        if( index < 0 || index > size ) { return; }
        Node n = head;
        while( index > 0 ) {
            n = n.next; index--;
        }
        Node temp = new Node( val, n.next );
        n.next = temp;
        size++;
    }
    
    public void deleteAtIndex(int index) {
        if( index < 0 || index >= size ) { return; }
        Node n = head;
        while( index > 0 ) {
            n = n.next; index--;
        }
        n.next = n.next.next;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */