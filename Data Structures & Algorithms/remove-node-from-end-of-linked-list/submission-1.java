class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n!=0)return null;
        
        ListNode temp=head;
        int length=1;
        while(temp.next != null){
            temp=temp.next;
            length++;
        }
        if(n==length)return head.next;
        int index=length-n;
        temp=head;
        while(index-- > 1){
            temp=temp.next;
        }
        if(temp.next==null){
            temp=null;
        }
       else temp.next=temp.next.next;
        return head;
    }
}
