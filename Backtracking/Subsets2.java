/**
Input: nums = [1,2,2]
Output: [[],[1],[1,2],[1,2,2],[2],[2,2]]
 */
 class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        dfs(ans,0,new ArrayList<>(),nums,nums.length);
        return ans;
        
    }
    public void dfs(List<List<Integer>> ans,int index,List<Integer> arr,int[] a, int n)
    {
      ans.add( new ArrayList(arr));
        if(index == n)
            return;
    
        for(int i = index;i<n;i++)
        {
            if(i>index && a[i-1] == a[i])
                continue;
            
            arr.add(a[i]);
            dfs(ans,i+1,arr,a,n);

            arr.remove(arr.size()-1);

        }
                   

    }
}