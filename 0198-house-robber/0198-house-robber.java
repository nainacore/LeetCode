class Solution {
    public int rob(int[] nums) {
        int h1=0;
        int h2=0;
        for(int num:nums){
            int curr=Math.max(h1,h2+num);
            h2=h1;
            h1=curr;
        }
        return h1;
    }
}