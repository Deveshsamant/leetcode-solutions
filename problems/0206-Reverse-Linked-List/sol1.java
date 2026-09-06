// ==========================================================
// 206. Reverse Linked List
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44.1 MB (Beats 68%)
// Link       : https://leetcode.com/problems/reverse-linked-list/
// ==========================================================

        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=front;
                front=front.next;
        }
        head=prev;
            if(front!=null){
            }
        return head;


        ListNode front=curr.next;
        ListNode curr=head;