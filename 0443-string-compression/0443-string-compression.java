class Solution {
    public int compress(char[] chars) {
        int index=0;
        int i=0;
        while(i<chars.length){
            char curr=chars[i];
            int count=0;
            while(i<chars.length && chars[i]==curr){
                count++;
                i++;
            }
            chars[index++]=curr;
            if(count>1){
                String str=String.valueOf(count);
                for(char c:str.toCharArray()){
                    chars[index++]=c;
                }
            }
        }
        return index;

    }
}