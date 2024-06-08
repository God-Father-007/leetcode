class Solution {
    public char findTheDifference(String s, String t) {
        char[] c = t.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for( char x : c ) { map.put( x, map.getOrDefault(x,0) + 1 ); }
        c = s.toCharArray();
        for( char x : c ) { map.put( x, map.getOrDefault(x,2) - 1 ); }
        for( char x : map.keySet() ) {
            if( map.get(x) == 1 ) { return x; }
        }
        return '0';
    }
}