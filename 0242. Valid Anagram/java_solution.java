class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Arrays.sort( sa );
        Arrays.sort( ta );
        int i = 0;
        for( i = 0; i < sa.length; i++ ) {
            if( i >= ta.length || sa[i] !=ta[i] ) { return false; }
        }
        return i == ta.length;
    }
}