/**
Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B. */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int c1= 0;
        int c2=0;
        while(temp1 != null && temp2 != null)
        {
            if(temp1 == temp2)
                return temp1;
             if(temp1.next == null)
            {
                temp1 = headB;
                
               

            }


                
                
            
             if(temp2.next == null)
            {
                temp2 = headA;
                
                

            }
            temp1 = temp1.next;
            temp2 = temp2.next;
                


        }
        
        return null;
        
    }
}