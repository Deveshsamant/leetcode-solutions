// ==========================================================
// 237. Delete Node in a Linked List
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 45 MB (Beats 80%)
// Link       : https://leetcode.com/problems/delete-node-in-a-linked-list/
// ==========================================================

class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}