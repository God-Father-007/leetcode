class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer,List<String>> m = new HashMap<>();
        for( String s : strs ) {
            int code = getCode( s );
            if( !m.containsKey( code ) ) { m.put( code, new ArrayList<>() ); }
            List<String> l = m.get( code );
            l.add( s );
        }
        List<List<String>> ans = new ArrayList<>();
        for( int k : m.keySet() ) { ans.add( m.get(k) ); }
        return ans;
    }

    private int getCode(String s) {
        char[] c = s.toCharArray();
        Arrays.sort( c );
        return ( new String(c) ).hashCode();
    }
}