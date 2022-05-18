/**
Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5] */
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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null)
            return head;
        ListNode temp = head;
        ListNode temp1 = head;
        ListNode head1 = new ListNode(0) ;
        head1.next = head;
        ListNode prev = head1;
        int i = 1;
        
        while(temp != null)
        {
          if(i==k)
          {

              
              ListNode temp2 = temp.next;
              temp.next = null;
              ListNode pivot = reverse(temp1);
              prev.next = pivot;
              temp1.next = temp2;
              prev = temp1;
              temp = temp2;
              temp1 = temp2;
              i=1;




          }
            else
            {
                i++;
                temp = temp.next;

            }

        
        }
        
        return head1.next;
        
    }
}