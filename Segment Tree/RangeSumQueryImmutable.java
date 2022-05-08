/**
Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 

Example 1:

Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3] */
class NumArray {
int[] prefixsum = null;
    public NumArray(int[] nums) {
        
        prefixsum = new int[nums.length+1];
         for(int i =0;i<nums.length;i++)
         {

             prefixsum[i+1] = prefixsum[i] + nums[i];
         }
   
    }
    
    public int sumRange(int left, int right) {
        return prefixsum[right+1] - prefixsum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */