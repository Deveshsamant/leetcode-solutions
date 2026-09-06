// ==========================================================
// 876. Middle of the Linked List
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42.9 MB (Beats 53%)
// Link       : https://leetcode.com/problems/middle-of-the-linked-list/
// ==========================================================

        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
    public ListNode middleNode(ListNode head) {
            fast=fast.next;
        }
        return slow;
        
    }
}