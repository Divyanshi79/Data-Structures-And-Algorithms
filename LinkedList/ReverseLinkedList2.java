/**
Input: head = [1,2,3,4,5], left = 2, right = 4
Output: [1,4,3,2,5] */

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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode temp = head;
        
        if(left == right)
            return head;
        while(head != null && left > 2)
        {
            temp = temp.next;
            left--;

        }
        
        ListNode temp1 = head;
        while(head != null && right != 1)
        {
          temp1 = temp1.next;
            right--;
        }
        
        ListNode tail = temp1.next;
        temp1.next = null;
        if(left == 1)
        {
            head = reverse(head);

        }
        else

        {
            ListNode head1 = temp;
        temp = temp.next;
        head1.next = reverse(temp);
        }
        temp.next = tail;
          
        return head;
        
    }
}