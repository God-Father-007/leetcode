/**
 * @param {string} s
 * @return {string}
 */
 var longestPalindrome = function(s) {
    let l = 0, r = 0, n = s.length;
    let dp = createDP( n, false );
    let i = 0, j = 0;
    while( j < n ) {
        if( j == 0 ) { dp[i][i+j] = true; }
        else if( j == 1 ) { dp[i][i+j] = s[i] == s[i+j]; }
        else if( s[i] == s[i+j] ) { dp[i][i+j] = dp[i+1][i+j-1]; }
        if( dp[i][i+j] && j > r-l ) { l = i; r = i+j; }
        i++;
        if( i+j == n ) { i = 0; j++; }
    }
    return s.substring( l ,r+1 );
};

function createDP( n, val ) {
    let dp = [];
    for( let i = 0; i < n; i++ ) {
        dp[i] = [];
        for( let j = 0; j < n; j++ ) { dp[i].push(val); }
    }
    return dp;
}