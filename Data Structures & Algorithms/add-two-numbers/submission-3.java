

class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    
        int c = 0;
        ListNode temp = new ListNode(-1);
        ListNode ans = temp;

        while (l1 != null || l2 != null || c > 0) {
            int m = c;
            if (l1 != null) {
                m += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                m += l2.val;
                l2 = l2.next;
            }
            c = m / 10;
            temp.next = new ListNode(m % 10);
            temp = temp.next;
        }

        return (ans.next);  
    }
}
