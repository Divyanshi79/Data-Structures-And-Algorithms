
import java.util.*;
class Solution {
    public ListNode sortList(ListNode head) {
       
        if(head == null || head.next == null)
            return head;
        ListNode mid = middle(head);
        
        
        ListNode left = sortList(head);
        ListNode right = sortList(mid);
        return merge(left,right);
        
    }
    public ListNode middle(ListNode head)
    {
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
        
        }
        ListNode mid = slow.next;
        
        slow.next = null;
        return mid;

    }
    public ListNode merge(ListNode head1 , ListNode head2)
    {
        ListNode dummy = new ListNode(0),head = dummy;
        
        while(head1 != null && head2!= null)
        {
            if(head1.val < head2.val)
            {
                
                head.next = head1;
                head1 = head1.next;
                

            }
            else
            {
                
                head.next = head2;
                head2 = head2.next;

            }
            head = head.next;

        }

        head.next = head1 != null ? head1 : head2;
        return dummy.next;

    }
    
}