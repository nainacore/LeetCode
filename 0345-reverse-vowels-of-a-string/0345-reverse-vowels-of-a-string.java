class Solution {
    public String reverseVowels(String s) {
        char[] arr= s.toCharArray();
        ArrayList<Character> v=new ArrayList<>();
        for(char c : arr){
            if(isVowel(c)){
                v.add(c);
            }
        }
        int index= v.size()-1;
        for(int i=0;i<arr.length;i++){
            if(isVowel(arr[i])){
                arr[i]=v.get(index);
                index--;
            }
        }
        return new String(arr);

    }
    public boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}