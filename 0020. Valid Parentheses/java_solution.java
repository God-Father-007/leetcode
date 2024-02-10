class Solution {
    public boolean isValid(String s) {
        HashMap<Character,Character> a = new HashMap<>();
        a.put(']','[');
        a.put('}','{');
        a.put(')','(');
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '{' || c == '(') {st.push(c);}
            else {
                if(st.size() == 0) {
                    return false;
                } else if(st.peek() == a.get(c)) {st.pop();}
                else {return false;}
            }
        }
        if(st.size() != 0) {return false;}
        return true;
    }
}