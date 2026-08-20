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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] parts= new ListNode[k];

        int len=0;
        ListNode node=head;
        while(node != null){
            node=node.next;
            len++;
        }


        int n=len/k;
        int r=len%k;

        node=head;
       
        for(int i=0; i<k; i++){
            parts[i] = node;
            int size=n;

            if(r>0){
                size++;
                r--;
            }
            for(int j=1; j<size; j++){
                node=node.next;
            }
            if(node != null){
                ListNode next = node.next;
                node.next=null;
                node=next;
            }
        }
        return parts;
    }
}