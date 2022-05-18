/**
Input: head = [1,0,1]
Output: 5
Explanation: (101) in base 2 = (5) in base 10 */

class Solution {

    public int getDecimalValue(ListNode head) {
        int n =0;
        ListNode temp = head;
        int l =0;
        while(temp != null)
        {
           l++;
            temp= temp.next;

        }
        l--;
        while(head != null)
        {
            n += head.val*(int)Math.pow(2,l--);
            head = head.next;
            
        }
        
       
        return n;
        
    }
}