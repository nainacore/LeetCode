class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<>();
        }
        
        String[] mapping = {
            "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        
        List<String> result = new ArrayList<>();
        result.add("");
        
        for (char digit : digits.toCharArray()) {
            String letters = mapping[digit - '0'];
            List<String> newResult = new ArrayList<>();
            
            for (String prefix : result) {
                for (char c : letters.toCharArray()) {
                    newResult.add(prefix + c);
                }
            }
            result = newResult;
        }
        
        return result;

    }
}