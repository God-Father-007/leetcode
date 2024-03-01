class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> ans = new ArrayList<>();
        int i=0, j=i+1;
        while( i < words.length ) {
            StringBuilder s1 = new StringBuilder(words[i]);
            int l = s1.length();
            while( j < words.length && l + words[j].length() + j-i <= maxWidth ) {
                l += words[j].length();
                j++;
            }
            l = maxWidth-l;
            int gap = j-i-1 == 0 ? 1 : j-1-i;
            int least = l/gap, extra = l%gap;
            if( j == words.length ) { least = 1; extra = 0; }
            for( int x = i+1; x < j; x++ ) {
                for( int g=1;g<=least;g++ ) { s1.append(" "); }
                if( extra > 0 ) { s1.append(" "); extra--; }
                s1.append( words[x] );
            }
            while( s1.length() < maxWidth ) { s1.append(" "); }
            ans.add( s1.toString() );
            i=j; j=i+1;
        }
        return ans;
    }
}