class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words = ( s1 + " " + s2 ).split(" ");
        Set<String> present = new HashSet<>();
        Set<String> unique = new HashSet<>();
        for( String w : words ) {
            if( present.contains(w) ) {
                if( unique.contains(w) ) { unique.remove(w); }
            } else {
                present.add( w );
                unique.add(w);
            }
        }
        return unique.toArray(String[]::new);
    }
}