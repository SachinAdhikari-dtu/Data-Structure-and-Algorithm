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
        ListNode next;
        ListNode prev=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            
        }
        return prev;
    }
    public static ListNode getmid(ListNode head){
        ListNode s=head;
        ListNode f=head.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ListNode mid=getmid(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;

        right=reverse(right);

        while(left!=null && right != null){
            if(left.val != right.val)return false;
            left=left.next;
            right=right.next;
        }

        return true;


    }
}