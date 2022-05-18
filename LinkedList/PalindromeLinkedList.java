
class Solution {
    public ListNode reverse(ListNode head1)
    {
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
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        
        
        while(fast.next!= null && fast.next.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;

        }
        slow.next = reverse(slow.next);
        slow = slow.next;
        
        
        
      
        
        while(slow != null )
        {
            if(slow.val != head.val)
                return false;
            head = head.next;
            
            slow = slow.next;

        }
       
        
        
        return true;
    }
}