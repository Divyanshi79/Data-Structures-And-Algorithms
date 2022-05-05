/**
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.
Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
 */

 class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        
        int n = a.length;
        
        Set<List<Integer>> res = new HashSet<>();
        if(n<3)
            return new ArrayList<>();
        
        Arrays.sort(a);
   for(int k=0;k<(n-2);k++)
   {
       int target = -1 * a[k];
      
       int i = k+1;
       int j = n-1;
       while(i<j)
       {
           // System.out.println(a[k] + " " + a[i] + " " + a[j]);
          
           if(a[i] + a[j] == target)
           {
               
              // List<Integer> arr = new ArrayList<>();
              //  arr.add(a[k]);
              //  arr.add(a[i]);
              //  arr.add(a[j]);
              //  listF.add(arr);
               res.add(Arrays.asList(a[k],a[i],a[j]));
               i++;
               j--;


           }
          else if(a[i] + a[j]  > target)
           {
               j--;


           }
           else
           {
               i++;

           }


       }


   }
        
        return new ArrayList<>(res);
    }
}