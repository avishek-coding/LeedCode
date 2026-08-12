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
    
        public ListNode Middle(ListNode head){
            ListNode fast=head;
            ListNode slow=head;

            while(fast != null && fast.next != null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }

        public ListNode Reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;  

        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }


    public boolean isPalindrome(ListNode head) {
        ListNode mid= Middle(head);
        ListNode secondHalf= Reverse(mid);
        ListNode temp=secondHalf;

        while(head != null & secondHalf != null){
            if(head.val != secondHalf.val){
                break;
            }
            head=head.next;
            secondHalf=secondHalf.next;
        }
        Reverse(temp);

        if(head == null || secondHalf == null){
            return true;
        }
        return false;
    }
}