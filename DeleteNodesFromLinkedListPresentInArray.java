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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],1);
        }
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        ListNode ans=null;
        for(int i=0;i<list.size();i++){
            if(!map.containsKey(list.get(i))){
                current.next=new ListNode(list.get(i));
                current=current.next;
            }
        }
        return dummy.next;
    }
}
