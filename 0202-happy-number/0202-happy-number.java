class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h=new HashSet<>();
        while(n!=1 && !h.contains(n)){
            h.add(n);
            n=getNext(n);
        }
        return n==1;
    }
    private int getNext(int n){
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum+=dig*dig;
            n /=10;
        }
        return sum;
    }
}