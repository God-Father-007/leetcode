class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> s = new HashSet<>();
        for( String word : words ) {
            String code = "";
            for( int i=0;i<word.length();i++ ) {
                code += codes[word.charAt(i) - 'a'];
            }
            s.add(code);
        }
        return s.size();
    }
}