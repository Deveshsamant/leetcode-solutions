// ==========================================================
// 138. Copy List with Random Pointer
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 46.8 MB (Beats 14%)
// Link       : https://leetcode.com/problems/copy-list-with-random-pointer/
// ==========================================================

            curr=curr.next;
            map.put(curr, temp);
        while(curr!=null){
            Node temp=new Node(curr.val);
            gg.next=temp;
            gg=gg.next;
        Node curr=head;
        Node gg=head2;
        Node head2=new Node(0);
class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) { return null; } 
        HashMap<Node, Node> map = new HashMap<>();

            
        }