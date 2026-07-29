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
    public static ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        ListNode next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1=reverse(l1);
        l2=reverse(l2);
        ListNode temp=new ListNode(-1);
        ListNode ans=temp;

        int c=0;
            while(l1!=null || l2!=null || c>0){
                int curr=c;
                if(l1!=null){
                    curr+=l1.val;
                    l1=l1.next;
                }
                if(l2!=null){
                    curr+=l2.val;
                    l2=l2.next;
                }
        ListNode t=new ListNode(curr%10);
        c=curr/10;
        temp.next=t;
        temp=temp.next;

            
            }








        return reverse(ans.next);
    }
}