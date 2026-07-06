class Solution {
    public int maxSubArray(int[] nums) {
        int res=nums[0];
        int maxEnd=nums[0];
        for(int i=1;i<nums.length;i++){
            maxEnd=Math.max(maxEnd+nums[i],nums[i]);
            res=Math.max(res,maxEnd);
        }
        return res;
    }
}