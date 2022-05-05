/**
Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
Example 1:
Input: nums = [1,1,1], k = 2
Output: 2
 */
 class Solution {
    public int subarraySum(int[] a, int k) {
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        int s=0;
        hm.put(0,1);
        int ans = 0;
        int n = a.length;
        
        for(int i =0;i<n;i++)
        {
            
            s=s+a[i];
            
            System.out.println(s-k);
            if(hm.containsKey(s-k))
            {
                ans += hm.get(s-k);
              }
            hm.put(s,hm.getOrDefault(s,0)+1);

        }
        
        
        
        
    
    return ans;
    }
}