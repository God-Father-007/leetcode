class Solution {
    public int lengthOfLastWord(String s) {
        int l = 0;
        for(int i=s.length()-1;i>=0;i--) {
            if( s.charAt(i) != ' ' ) {break;}
            s = s.substring(0,i);
        }
        for(int i=s.length()-1;i>=0;i--) {
            if( s.charAt(i) == ' ' ) {break;}
            l++;
        }
        return l;
    }
}