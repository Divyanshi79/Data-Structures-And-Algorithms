/**
Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
] */

class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
     ans = new ArrayList<List<Integer>>();
        List<Integer> arr = new ArrayList<>();
        int j =0;
        Arrays.sort(candidates);
        dfs(candidates,target,0,arr);
        return ans;
        
    }
    public void dfs(int[] a,int t , int index , List<Integer> arr)
    {
       if(t==0)
        { ans.add(new ArrayList(arr));
            return; }
        for(int i = index ;i<a.length;i++ )
        {
    if(i>index && a[i] == a[i-1])
        continue;
    if(a[i]>t)
        break;
    arr.add(a[i]);
    dfs(a,t-a[i],i+1,arr);
    arr.remove(arr.size()-1);
}         
    }
}