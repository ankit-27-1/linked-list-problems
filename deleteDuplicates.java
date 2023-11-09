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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode prev=head;
        while(prev!=null && prev.next!=null){
            if(prev.val==prev.next.val){
                prev.next=prev.next.next;
            }
            else{
                prev=prev.next;
            }
        }
        return head;
    }
}
