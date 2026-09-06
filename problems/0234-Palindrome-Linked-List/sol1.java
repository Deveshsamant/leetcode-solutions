// ==========================================================
// 234. Palindrome Linked List
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 67%)
// Memory     : 94.2 MB (Beats 79%)
// Link       : https://leetcode.com/problems/palindrome-linked-list/
// ==========================================================

            head=head.next;
        }
        return true;
    }
    private ListNode reverse(ListNode node) {
        ListNode prev = null;
        while (node != null) {
            ListNode next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        return prev;