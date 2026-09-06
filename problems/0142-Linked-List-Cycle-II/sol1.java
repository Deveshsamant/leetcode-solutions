// ==========================================================
// 142. Linked List Cycle II
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 46.6 MB (Beats 70%)
// Link       : https://leetcode.com/problems/linked-list-cycle-ii/
// ==========================================================

            if(slow==fast){
                break;
            }
        }

                gg=true;
        if (!gg) {
            return null;
        }
        slow = head;       
        while (slow != fast) {      
            slow = slow.next;
            fast = fast.next;        
        }
        return slow;
    }
}