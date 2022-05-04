/****

75. Sort Colors
Medium

9676

412

Add to List

Share
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

 

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:

Input: nums = [2,0,1]
Output: [0,1,2]



*** */


class Solution {
    public void sortColors(int[] a) {
        int low = 0;
        int mid = 0;
        int n = a.length;
        int high = n-1;
        while(mid<=high)
        {
            if(a[mid] == 0)
            {
                int t = a[mid];
                a[mid] = a[low];
                a[low] = t;
                mid++;
                low++;
            

            }
            else if(a[mid] == 1)
            mid++;
          else if(a[mid] == 2)
            {
                int t = a[high];
                a[high] = a[mid];
                a[mid] = t;
                high --;
               
                
                    

            }

          
        
        }
        
    }
}