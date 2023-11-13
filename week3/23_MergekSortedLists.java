/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> q = new PriorityQueue<ListNode>((ListNode a, ListNode b) -> a.val - b.val);
        for(ListNode list: lists){
            if(list != null){
                q.add(list);
            }
        }

        ListNode ptr = new ListNode(-1);
        ListNode head = ptr;
        while(!q.isEmpty()){
            //current = smallest
            ListNode current = q.poll();
            ptr.next = new ListNode(current.val);
            ptr = ptr.next;
            //put the remain back
            if(current.next != null){
                q.add(current.next);
            }
        }
        //head.next points to the first real node of the merged list
        return head.next;
    }
}