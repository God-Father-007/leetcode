class Solution {
    
    class pair implements Comparable<pair>{
        char c;
        int f;
        
        pair(char c, int f) {
            this.c = c;
            this.f = f;
        }
        
        public int compareTo( pair o ) {
            return o.f - this.f;
        }
    }
    
    public String reorganizeString(String s) {
        int n = s.length();
        HashMap<Character,Integer> h = new HashMap<>();
        for( int i=0;i<n;i++ ) {
            char c = s.charAt(i);
            if( !h.containsKey(c) ) { h.put(c,1); } else { h.put( c, h.get(c)+1 ); }
        }
        for( int v : h.values() ) {
            if( v > (n+1)/2 ) { return ""; }
        }
        PriorityQueue<pair> p = new PriorityQueue<>();
        for( char c : h.keySet() ) { p.add( new pair(c,h.get(c)) ); }
        pair blocked = p.poll();
        String ans = "";
        ans += blocked.c;
        blocked.f--;
        while( p.size() > 0 ) {
            pair temp = p.poll();
            ans += temp.c;
            temp.f--;
            if( blocked.f > 0 ) { p.add(blocked); }
            blocked = temp;
        }
        return ans;
    }
}