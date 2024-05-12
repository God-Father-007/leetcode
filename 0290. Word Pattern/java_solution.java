class Solution {
    public boolean wordPattern(String pattern, String s) {
        return getCode( pattern, "" ).equals( getCode( s, " " ) );
    }

    private String getCode(String s, String delimiter) {
        String[] words = s.split(delimiter);
        Map<String,Integer> map = new HashMap<>();
        int count = 1;
        StringBuilder code = new StringBuilder();
        for( String word : words ) {
            if( !map.containsKey( word ) ) {
                map.put( word, count );
                count++;
            }
            code.append( map.get(word) + "-" );
        }
        return code.toString();
    }
}