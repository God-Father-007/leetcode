class Solution {
    
    private boolean isVowel(char c) {
        if( c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' ) { return true; }
        return false;
    }
    
    public String toGoatLatin(String sentence) {
        String[] words = sentence.split(" ");
        String ans = "", postfix = "";
        for(int i=0;i<words.length;i++) {
            String word = words[i];
            postfix += "a";
            if( isVowel(word.charAt(0)) ) {
                ans += word + "ma";
            } else {
                ans += word.substring(1) + word.charAt(0) + "ma";
            }
            ans += postfix;
            if( i < words.length-1 ) { ans += " "; }
        }
        return ans;
    }
}