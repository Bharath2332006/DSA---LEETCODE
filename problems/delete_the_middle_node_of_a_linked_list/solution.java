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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode curr1=head;
        ListNode curr2=head.next.next;
        while(curr2!=null && curr2.next!=null){
            curr1=curr1.next;
            curr2=curr2.next.next;
        }
        curr1.next=curr1.next.next;

        return head;
        
    }
}