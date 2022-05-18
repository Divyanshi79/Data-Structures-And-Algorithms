/**
Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.
Input: head = [1,4,3,2,5,2], x = 3
Output: [1,2,2,4,3,5] */
class Solution {
ListNode partition(ListNode head, int x){
        ListNode lessHead=null,moreHead=null,newLessHead = null,newMoreHead=null;

        while(head!=null){
            if(head.val<x){
                if(lessHead==null){
                    lessHead = new ListNode(head.val);
                    newLessHead = lessHead;
                }
                else{
                    lessHead.next = new ListNode(head.val);
                    lessHead = lessHead.next;
                }
            }
            else{
                if(moreHead==null){
                    moreHead = new ListNode(head.val);
                    newMoreHead = moreHead;
                }
                else{
                    moreHead.next = new ListNode(head.val);
                    moreHead = moreHead.next;
                }
            }
            head = head.next;
        }
        if(newLessHead==null){
            newLessHead = newMoreHead;
            return newLessHead;
        }
        lessHead.next = newMoreHead;
        return newLessHead;
    }
}