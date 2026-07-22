class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> pre=new HashMap<>();
        pre.put(0,1);
        int sum=0;
        int count=0;
        for(int num:nums){
            sum+=num;

            if(pre.containsKey(sum-k)){
                count+=pre.get(sum-k);
            }
            pre.put(sum,pre.getOrDefault(sum,0)+1);
        }
        return count;
    }
}