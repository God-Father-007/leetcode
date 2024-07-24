class Solution {
    public boolean detectCapitalUse(String word) {
        int c = word.charAt(0);
        word = word.substring(1);
        return ( c < 94 && word.equals( word.toUpperCase() ) ) || word.equals( word.toLowerCase() );
    }
}