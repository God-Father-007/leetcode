/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *     // Constructor initializes an empty nested list.
 *     public NestedInteger();
 *
 *     // Constructor initializes a single integer.
 *     public NestedInteger(int value);
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // Set this NestedInteger to hold a single integer.
 *     public void setInteger(int value);
 *
 *     // Set this NestedInteger to hold a nested list and adds a nested integer to it.
 *     public void add(NestedInteger ni);
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
class Solution {
    public NestedInteger deserialize(String s) {
        char[] c = s.toCharArray();
        Stack<NestedInteger> st = new Stack<>();
        for( int i=0; i<c.length; i++ ) {
            if( c[i] == ',' ) { continue; }
            if( c[i] == '[' ) { st.push(null); continue; }
            if( c[i] == ']' ) {
                NestedInteger ni = new NestedInteger();
                Stack<NestedInteger> temp = new Stack<>();
                while( st.size() > 0 && st.peek() != null ) { temp.push( st.pop() ); }
                if( st.size() > 0 ) { st.pop(); }
                while( temp.size() > 0 ) { ni.add( temp.pop() ); }
                st.push(ni);
                continue;
            }
            int j = i, num = 0;
            if( c[i] == '-' ) { j++; }
            while( j < c.length && c[j] >= '0' && c[j] <= '9' ) {
                num = num*10 + (c[j]-'0'); j++;
            }
            if( c[i] == '-' ) { num = -num; }
            i = j - 1;
            st.push( new NestedInteger(num) );
        }
        return st.pop();
    }
}