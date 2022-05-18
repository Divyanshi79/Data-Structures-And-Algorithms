/**
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4] */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if(list1 == null)
           return list2;
        if(list2 == null)
            return list1;
        ListNode head = null;
        ListNode tail = null;
        if(list1.val<list2.val)
        {
            tail = list1;
            list1 = list1.next;
            
        }
        else
        {
            tail = list2;
            list2 = list2.next;
            
        }
        head = tail;

                while(list1 != null && list2 !=null)
                {
                    
                    if(list1.val<list2.val)
                    {
                        tail.next = list1;
                        list1 = list1.next;
                        

                    }
                    else 
                    {
                        tail.next = list2;
                        list2 = list2.next;
                        
                    }
                    tail = tail.next;
                    
                    
                    
                    

                }
            if(list1 != null)
                tail.next = list1;
            if(list2 != null)
                tail.next = list2;
        
       
      

        
        return head;

              }
}