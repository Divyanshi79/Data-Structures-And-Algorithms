/**
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]
 */

 class Solution {
    public List<Integer> findDuplicates(int[] a) {
        List<Integer> arr = new ArrayList<Integer>();
        int n = a.length;
        for(int i =0;i<n;i++)
        {
            int index = Math.abs(a[i])-1;
            // System.out.print(index);
            if(a[index] < 0)
            {
                arr.add(Math.abs(a[i]));

            }
            else
            {
                a[index] = -a[index];

            }

         
        }
        return arr;
        
    }
}