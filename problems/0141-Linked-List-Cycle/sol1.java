// ==========================================================
// 141. Linked List Cycle
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 47 MB (Beats 16%)
// Link       : https://leetcode.com/problems/linked-list-cycle/
// ==========================================================

public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null || head.next==null){
            return false;
        }
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow == fast){
                return true;
            }
        }

        return false;
 */
 * }
 *     }