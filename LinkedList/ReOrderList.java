/**
https://leetcode.com/problems/reorder-list/ */
class Solution {
    public ListNode reverse(ListNode head1) {
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
    public void reorderList(ListNode head) {
        if(head == null || head.next == null)
            return;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
            
        }
       prev.next = reverse(prev.next);
        slow = prev.next;
        prev.next = null;
        ListNode temp = head;
        
        while(temp != null)
        {
            ListNode node = temp.next;
            prev = temp;
            temp.next = slow;
            temp = temp.next;
            
            
            slow = slow.next;
            if(temp != null)
            {
                prev = temp;
            temp.next = node;
            temp = temp.next;
            }
            

        }
        if(slow != null)
            prev.next = slow;
      
    }
}