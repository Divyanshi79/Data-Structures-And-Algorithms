class Solution {
    public ListNode reverseList(ListNode head1) {
        ListNode fwd = head1;
        ListNode prev = null;
        ListNode curr = head1;
        while(curr!=null)
        {
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
            

        }
        return prev;
    }
}