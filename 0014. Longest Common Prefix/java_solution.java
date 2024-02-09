class Solution {
    public StringBuilder common(StringBuilder s1, StringBuilder s2) {
        if(s1.equals("") || s2.equals("") ) {return new StringBuilder();}
        int i = 0;
        while( i < s1.length() && i < s2.length()) {
            if(s1.charAt(i) != s2.charAt(i)) {break;}
            i++;
        }
        if(i == 0) {return new StringBuilder();}
        return new StringBuilder(s1.substring(0,i));
    }
    
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) {return "";}
        StringBuilder ans = new StringBuilder(strs[0]);
        for(int i=1;i<strs.length;i++) {
            ans = common(ans,new StringBuilder(strs[i]));
            if(ans.equals("")) {return "";}
        }
        return ans.toString();
    }
}