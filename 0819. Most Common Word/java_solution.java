class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String[] words = paragraph.split( " |,|\\?|!|;|\\.|'" );
        Set<String> b = new HashSet<>();
        Map<String,Integer> m = new HashMap<>();
        int f = 0;
        String ans = "";
        b.add("");
        for( String word : banned ) { b.add( word ); }
        for( String word : words ) {
            word = word.toLowerCase();
            if( b.contains( word ) ) { continue; }
            m.put( word, m.getOrDefault( word, 0 ) + 1 );
            if( m.get( word ) > f ) { f = m.get(word); ans = word; }
        }
        return ans;
    }
}