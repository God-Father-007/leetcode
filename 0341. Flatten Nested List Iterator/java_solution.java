/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    List<Integer> list;
    int i;
    public NestedIterator(List<NestedInteger> nestedList) {
        this.list = new ArrayList<>();
        fill( nestedList );
        i = -1;
    }

    private void fill( List<NestedInteger> nil ) {
        for( NestedInteger ni : nil ) {
            if( ni.isInteger() ) { this.list.add( ni.getInteger() ); }
            else { fill( ni.getList() ); }
        }
    }

    @Override
    public Integer next() {
        return this.list.get(++i);
    }

    @Override
    public boolean hasNext() {
        return i+1 < this.list.size();
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */