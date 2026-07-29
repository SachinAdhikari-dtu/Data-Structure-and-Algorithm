
class Solution {

    public static ListNode getMid(ListNode head){
        ListNode s=head;
        ListNode f=head.next;
        while(f!=null  && f.next!= null){
            s=s.next;
            f=f.next.next;
        }
        return s;
    }

    public static ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode next;
        while(head!=null){
            next=head.next;
            head.next=prev;
            prev=head;
            head=next;
            
        }
        return prev;
    }

    public int pairSum(ListNode head) {
        ListNode mid=getMid(head).next;
        mid=reverse(mid);

        int max=0;
        while(head!=null && mid!=null){
           max=Math.max(max,head.val+mid.val);
            head=head.next;
            mid=mid.next;
        }
        return max;
    }
}