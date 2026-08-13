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
    public void reorderList(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
    //MIDDLE
        while(fast !=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
        }
    //REVERSE
        ListNode prev=null;
        
        while(slow != null){
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;
        }

        ListNode first=head;
        ListNode second=prev;

        while(second.next != null){
            ListNode firstNext=first.next;
            ListNode secondNext=second.next;

            first.next=second;
            second.next=firstNext;

            first=firstNext;
            second=secondNext;
        }
    }
}