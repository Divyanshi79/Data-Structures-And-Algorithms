/***
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5] */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head != null && head.val == val)
            head = head.next;
        if(head == null)
            return head;
        ListNode temp = head;
        
        while(temp != null && temp.next != null)
        {
            if(temp.next.val == val)
                temp.next = temp.next.next;
            else
                temp = temp.next;

        }
    
        return head;
        
    }
}