// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.

 

// Example 1:

// Input: nums = [1,0,-1,0,-2,2], target = 0
// Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]


class Solution {
    public List<List<Integer>> fourSum(int[] a, int target) {
        Set<List<Integer>> res = new HashSet<>();
        int n = a.length;
        if(n<4)
            return new ArrayList<>();
        Arrays.sort(a);
        for(int k=0;k<n-3;k++)
        {

            for(int p = k+1;p<n-2;p++)
            {
                
                int t = a[k] +a[p];
                int i = p+1;
                int j = n-1;
                while(i<j)
                {
                    // System.out.println(a[k] + " " + a[p] + " " + a[i] + " " + a[j]);

                    if(a[i] + a[j] + t == target)
                    {
                        res.add(Arrays.asList(a[k],a[p],a[i],a[j]));
                        i++;
                        j--;

                    
                    }
                    else if(a[i] + a[j] + t > target)
                    {
                        j--;

                    
                    }
                    else
                    {
                        i++;

                    
                    }
                
                
                }



            
            }


        }
        
        return new ArrayList<>(res);
    }
}