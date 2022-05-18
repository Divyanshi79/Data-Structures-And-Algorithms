/**
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5] */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
         ListNode temp = head;

        int l =0;
        while(temp != null)
        {
            temp = temp.next;
            l++;

        }
        if(n==l)
            return head.next;
        n = l-n;
        temp = head;
        while(n>1){
            temp=temp.next;
            n--;
        }
        temp.next=temp.next.next;
        return head;
        
    }
}