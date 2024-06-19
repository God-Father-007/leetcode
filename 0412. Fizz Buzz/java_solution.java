class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ans = IntStream.rangeClosed(1, n).boxed().map(Object::toString).collect(Collectors.toList());
        for( int i=2;i<n;i=i+3 ) { ans.set(i,"Fizz"); }
        for( int i=4;i<n;i=i+5 ) {
            if( (i+1)%3 == 0 ) { ans.set(i,"FizzBuzz"); continue; }
            ans.set(i,"Buzz");
        }
        return ans;
    }
}