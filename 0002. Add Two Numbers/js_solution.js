/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} l1
 * @param {ListNode} l2
 * @return {ListNode}
 */
 var addTwoNumbers = function(l1, l2) {
    let carry = 0;
    let dummy = new ListNode( -1, null ), ans = dummy;
    while( l1 || l2 ) {
        let d = (l1 ? l1.val : 0) + (l2 ? l2.val : 0) + carry;
        ans.next = new ListNode( d % 10, null );
        carry = Math.floor(d / 10);
        ans = ans.next;
        if( l1 ) l1 = l1.next;
        if( l2 ) l2 = l2.next;
    }
    if( carry ) ans.next = new ListNode( carry, null );
    return dummy.next;
};