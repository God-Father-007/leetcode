/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */

/**
 * 2 pointer approach
 * runs in O(nlog(n)) time
 */

 var twoSum = function(nums, target) {
    let numsCopy = [ ...nums ];
    numsCopy.sort( (a,b) => a-b );
    let i = 0, j = numsCopy.length-1;
    while( i < j ) {
        if( numsCopy[i] + numsCopy[j] == target ) { break; }
        else if( numsCopy[i] + numsCopy[j] > target ) { j--; }
        else { i++; }
    }
    return [ nums.indexOf( numsCopy[i] ), nums.lastIndexOf( numsCopy[j] ) ];
};