class Solution {
    
    private ArrayList<String> helper( String s, int i, String[] map ) {
        ArrayList<String> ans = new ArrayList<>();
        if( i == s.length() ) {
            if( i > 0 ) { ans.add(""); }
            return ans;
        }
        ArrayList<String> temp = helper( s, i+1, map );
        String code = map[ s.charAt(i)-'0' - 2 ];
        for( int j=0;j<code.length();j++ ) {
            char c = code.charAt(j);
            for( String pre : temp ) { ans.add( c+pre ); }
        }
        return ans;
    }
    
    public List<String> letterCombinations(String digits) {
        String[] map = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        return helper( digits, 0, map );
    }
}