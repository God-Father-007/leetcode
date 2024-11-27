class Solution {

    private String code( String p ) {
        Map<Character,Integer> map = new HashMap<>();
        StringBuilder s = new StringBuilder(p);
        StringBuilder ans = new StringBuilder();
        int count = 1;
        for( int i=0; i<s.length();i++ ) {
            char c = s.charAt(i);
            if( !map.containsKey(c) ) {
                map.put(c,count);
                count++;
            }
            ans.append( map.get(c) + "-" );
        }
        return ans.toString();
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        String pCode = code( pattern );
        List<String> ans = new ArrayList<>();

        for( String word : words ) {
            if( pCode.equals( code(word) ) ) { ans.add(word); }
        }

        return ans;
    }
}