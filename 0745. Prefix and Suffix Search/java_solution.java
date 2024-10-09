class WordFilter {
    String[] dict;
    public WordFilter(String[] words) {
        this.dict = words;
    }
    
    public int f(String pref, String suff) {
        for( int i = this.dict.length-1; i>= 0; i-- ) {
            if( dict[i].startsWith(pref) && dict[i].endsWith(suff) ) { return i; }
        }
        return -1;
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(pref,suff);
 */