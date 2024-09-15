class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> s = new Stack<>();
        int sum = 0;
        for( int i=0;i<ops.length;i++ ) {
            if( ops[i].equals("+") ) {
                int a = s.pop(), b = s.peek();
                s.push(a);
                s.push(a+b);
                sum += s.peek();
            } else if( ops[i].equals("D") ) {
                s.push( 2*s.peek() );
                sum += s.peek();
            } else if( ops[i].equals("C") ) {
                sum -= s.pop();
            } else {
                s.push( Integer.parseInt( ops[i] ) );
                sum += s.peek();
            }
        }
        return sum;
    }
}