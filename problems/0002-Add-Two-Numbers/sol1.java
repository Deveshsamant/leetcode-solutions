// ==========================================================
// 2. Add Two Numbers
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 46.7 MB (Beats 20%)
// Link       : https://leetcode.com/problems/add-two-numbers/
// ==========================================================

            current = current.next;
            
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        
        return dummyHead.next;
    }
}