/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a=headA;
        ListNode b=headB;
        int ac=0;
        int bc=0;
        while(a!=null){
            a=a.next;
            ac++;
        }
        while(b!=null){
            b=b.next;
            bc++;
        }
        while(ac>bc){
            ac--;
            headA=headA.next;
        }
        while(bc>ac){
            bc--;
            headB=headB.next;
        }
        while(headA!=headB){
            headA=headA.next;
            headB=headB.next;
        }
        return headA;
    }
}
