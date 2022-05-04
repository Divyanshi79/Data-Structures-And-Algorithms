/***


Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 

Example 1:

Input: nums = [1,3,4,2,2]
Output: 2
Example 2:

Input: nums = [3,1,3,4,2]
Output: 3



***** */



class Solution {
    public int findDuplicate(int[] a) {
        for(int i =0;i<a.length;i++)
        {
            int index = Math.abs(a[i])-1;
            if(a[index] < 0)
            {
                return Math.abs(a[i]);

            }
            a[index] = -a[index];
        }
        return a.length;
        
    }
}