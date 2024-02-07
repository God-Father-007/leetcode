class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0, j=0, ans=0;
        HashMap<Character,Integer> h = new HashMap<>();
        while( j < s.length() ) {
            char c = s.charAt(j);
            if( h.containsKey(c) ) {
                ans = Math.max(ans, j-i);
                i = Math.max(i, h.get(c)+1);
            }
            h.put(c,j);
            j++;
        }
        return Math.max(ans, j-i);
    }
}