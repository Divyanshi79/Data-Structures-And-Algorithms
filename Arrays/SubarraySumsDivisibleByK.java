/** Given an integer array nums and an integer k, return the number of non-empty subarrays that have a sum divisible by k.

A subarray is a contiguous part of an array.

 

Example 1:

Input: nums = [4,5,0,-2,-3,1], k = 5
Output: 7
Explanation: There are 7 subarrays with a sum divisible by k = 5:
[4, 5, 0, -2, -3, 1], [5], [5, 0], [5, 0, -2, -3], [0], [0, -2, -3], [-2, -3]
*/

class Solution {
    public int subarraysDivByK(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int ans = 0;
        int sum =0;
        map.put(0,1);
        for(int i=0;i<a.length;i++)
        {
            sum += a[i];
            int rem = sum%k;
            if(rem<0)
            {
                rem +=k;

            }
            if(map.containsKey(rem))
            {
                ans+=map.get(rem);
                map.put(rem,map.get(rem)+1);

            }
            else
            {
                map.put(rem,1);

            }
            System.out.println(rem + " " + map.get(rem));
        }
        return ans;
        
    }
}