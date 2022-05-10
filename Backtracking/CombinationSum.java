/**
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations. */

class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     ans = new ArrayList<>();
        List<Integer> arr = new ArrayList<>();
        int j =0;
        Arrays.sort(candidates);
        dfs(candidates,target,0,arr);
        return ans;
        
    }
    public void dfs(int[] a,int t , int i , List<Integer> arr)
    {
        if(t==0)
        {
            
            ans.add(new ArrayList(arr));
            return;

        }
        if(i==a.length || a[i]>t)
        {
            return;

        }
        
        arr.add(a[i]);
       
        dfs(a,t-a[i],i,arr);
        t = t+arr.get(arr.size()-1);
         arr.remove(arr.size()-1);
        dfs(a,t-a[i],i+1,arr);
        
    }
}