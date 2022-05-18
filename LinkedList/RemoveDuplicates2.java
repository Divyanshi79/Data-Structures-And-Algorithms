/**
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5] */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
       if(head == null || head.next == null)
           return head;
        while(head!=null)
        {
            if(head.next != null && head.val == head.next.val)
            {
                while(head.next != null && head.val == head.next.val)
                    head = head.next;
                prev.next = head.next;

            }
            else
            {
                prev = prev.next;
            }
          head = head.next;
       
        }
        return dummy.next;
        
    }
}