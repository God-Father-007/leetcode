class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Map<Character,Character> map = new HashMap<>();
        Map<Character,Character> revMap = new HashMap<>();
        for( int i = 0; i < sc.length; i++ ) {
            if( !map.containsKey(sc[i]) ) {
                if( revMap.containsKey( tc[i] ) ) {
                    return false;
                }
                map.put( sc[i], tc[i] );
                revMap.put( tc[i], sc[i] );
            } else if( map.get(sc[i]) != tc[i] ) {
                return false;
            }
        }
        return true;
    }
}