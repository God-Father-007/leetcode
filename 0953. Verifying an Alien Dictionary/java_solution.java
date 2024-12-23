class Solution {
    
    private boolean isLex( String a, String b, HashMap<Character,Integer> h ) {
        for( int i=0;i<a.length() && i<b.length();i++ ) {
            if( h.get(a.charAt(i)) < h.get(b.charAt(i)) ) { return true; }
            if( h.get(a.charAt(i)) > h.get(b.charAt(i)) ) { return false; }
        }
        return !( a.length() > b.length() );
    }
    
    public boolean isAlienSorted(String[] words, String order) {
        HashMap<Character,Integer> h = new HashMap<>();
        for( int i=0;i<order.length();i++ ) { h.put( order.charAt(i), i ); }
        for( int i=0;i<words.length-1;i++ ) {
            if( !isLex(words[i], words[i+1], h) ) { return false; }
        }
        return true;
    }
}