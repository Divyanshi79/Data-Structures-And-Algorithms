class Solution {
    public void moveZeroes(int[] nums) {
        
        int n=nums.length;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
                nums[j++]=nums[i];
}
        for(int i=j;i<nums.length;i++)
   {
       nums[i]=0;
       
}



//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

//Input: nums = [0,1,0,3,12]
 //Output: [1,3,12,0,0]