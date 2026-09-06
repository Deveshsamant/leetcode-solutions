// ==========================================================
// 19. Remove Nth Node From End of List
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 43.4 MB (Beats 77%)
// Link       : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
// ==========================================================

        
        while(x!=1){
            prev=prev.next;
        if(x == 0){
            return head.next;
        }
        int x=count-n;
            x--;
        }
        temp=prev.next;
        prev.next=temp.next;

        return head;