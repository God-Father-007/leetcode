class MyHashMap {

    class Node {
        int key,val;
        Node next;
        Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

    private Node findPre(Node head, int e) {
        Node pre = null;
        while( head != null && head.key != e ) { pre = head; head = head.next; }
        return pre;
    }

    Node[] map;

    public MyHashMap() {
        map = new Node[10000];
    }
    
    public void put(int key, int value) {
        int i = key%map.length;
        if( map[i] == null ) { map[i] = new Node(-1,-1); }
        Node pre = findPre(map[i],key);
        if( pre.next == null ) { pre.next = new Node(key,value); }
        else{ pre.next.val = value; }
    }
    
    public int get(int key) {
        int i = key%map.length;
        Node pre = findPre(map[i],key);
        return map[i] == null || pre.next == null ? -1 : pre.next.val;
    }
    
    public void remove(int key) {
        int i = key%map.length;
        Node pre = findPre(map[i],key);
        if( map[i] == null || pre.next == null ) { return; }
        pre.next = pre.next.next;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */