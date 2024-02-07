/**
 * @param {string} s
 * @return {number}
 */
 var lengthOfLongestSubstring = function(s) {
    const lastIndex = new Map();
    let i = 0, j = 0, ans = 0;
    while( j < s.length ) {
        if( lastIndex.has( s[j] ) ) {
            ans = Math.max( ans, j-i );
            i = Math.max( i, lastIndex.get( s[j] ) + 1 );
        }
        lastIndex.set( s[j], j );
        j++;
    }
    return Math.max( ans, j-i );
};