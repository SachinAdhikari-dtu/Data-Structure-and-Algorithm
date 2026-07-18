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
    public static ListNode Mid(ListNode head){
        ListNode s= head;
        ListNode f=head.next;
        while(f!=null && f.next != null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public static ListNode reverse(ListNode head){
        ListNode next;
        ListNode prev=null;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode leftHead=head;
        ListNode mid=Mid(head);
        ListNode rightHead=reverse(mid.next);
        mid.next=null;
        ListNode leftNext;
        ListNode rightNext;
        while(leftHead != null && rightHead!= null){
            leftNext=leftHead.next;
            rightNext=rightHead.next;

            leftHead.next=rightHead;
            rightHead.next=leftNext;
            
            leftHead=leftNext;
            rightHead=rightNext;
        }

        while( rightHead!= null){
            rightNext=rightHead.next;
            leftHead.next=rightHead;
            rightHead=rightNext;
        }
       
    }
}
