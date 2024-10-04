class MyCalendar {
    class Node{
        int start, end;
        Node next;
        Node( int start, int end ) {
            this.start = start;
            this.end = end;
            this.next = null;
        }
    }

    Node root;
    public MyCalendar() {
        root = new Node(-1,-1);
    }
    
    public boolean book(int start, int end) {
        Node temp = root;
        while( temp.next != null ) {
            Node n = temp.next;
            if( n.start == start ) { return false; }
            else if( n.start < start ) {
                if( n.end > start ) { return false; }
                temp = temp.next;
            } else {
                if( end > n.start ) { return false; }
                break;
            }
        }
        Node entry = new Node( start, end );
        entry.next = temp.next;
        temp.next = entry;
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */