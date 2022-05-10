/**
Input: n = 4, k = 2
Output:
[
  [2,4],
  [3,4],
  [2,3],
  [1,2],
  [1,3],
  [1,4],
] */

class Solution {
    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        
        dfs(new ArrayList<>(),1,n,k);
        return ans;
        
    }
    public void dfs(List<Integer> arr, int index,int n,int k)
    {
        if(k==0)
        {
            ans.add(new ArrayList(arr));
            return;

        }
       
        for(int i =index;i<=n-k+1;i++)
        {
            arr.add(i);
            dfs(arr,i+1,n,k-1);
            arr.remove(arr.size()-1);
            

        }
            

    
    }
}