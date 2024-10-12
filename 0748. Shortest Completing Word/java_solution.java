class Solution {
    
    private boolean valid( String lp, String word ) {
        if( lp.length() > word.length() ) { return false; }
        int l = word.length();
        for( int i=0;i<lp.length();i++ ) {
            word = word.replaceFirst( lp.charAt(i)+"", "" );
            l--;
            if( word.length() != l ) { return false; }
        }
        return true;
    }
    
    public String shortestCompletingWord(String licensePlate, String[] words) {
        String ans = "----------------";
        String lp = licensePlate.replaceAll(" ","").replaceAll("\\d","").toLowerCase();
        for( String word : words ) {
            if( valid(lp, word) && word.length() < ans.length() ) { ans = word; }
        }
        return ans;
    }
}