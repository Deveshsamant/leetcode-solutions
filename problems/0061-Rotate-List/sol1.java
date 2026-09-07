// ==========================================================
// 61. Rotate List
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44 MB (Beats 96%)
// Link       : https://leetcode.com/problems/rotate-list/
// ==========================================================

        int x=Math.abs(count-k);
        ListNode temp=head;
        if(k==0){
            return head;
        }
        while(x!=1){
            temp=temp.next;
            x--;
        }

        ListNode temp1=temp.next;
        tail.next=head;
        head=temp1;
        temp.next=null;
        return head;
