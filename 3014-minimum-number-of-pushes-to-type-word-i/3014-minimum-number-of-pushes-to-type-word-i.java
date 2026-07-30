class Solution {
    public int minimumPushes(String word) {
        int res=0;
        int n=word.length();
        for(int i=0;i<n;i++){
            res+=(i/8)+1;
        }
        return res;
    }
}