// ==========================================================
// 234. Palindrome Linked List
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 4 ms (Beats 67%)
// Memory     : 94.5 MB (Beats 55%)
// Link       : https://leetcode.com/problems/palindrome-linked-list/
// ==========================================================

        //finding mid
        while(fast!=null && fast.next!=null){
            slow=slow.next;
        ListNode slow=head;

            fast=fast.next.next;
        }
        ListNode secondHead = reverse(slow);
        ListNode jj=head;
    
        while(secondHead!=null){
            if(head.val!=secondHead.val){
        ListNode fast=head;
    public boolean isPalindrome(ListNode head) {
                return false;
            }

            secondHead=secondHead.next;