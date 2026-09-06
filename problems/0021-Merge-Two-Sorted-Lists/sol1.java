// ==========================================================
// 21. Merge Two Sorted Lists
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44.4 MB (Beats 20%)
// Link       : https://leetcode.com/problems/merge-two-sorted-lists/
// ==========================================================

                h1 = h1.next;
            }
        }

        if(h2 != null){
            prev.next = h2;
        }

        return list1;
    }
}
