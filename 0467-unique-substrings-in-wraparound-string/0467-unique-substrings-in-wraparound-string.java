class Solution {
    public int findSubstringInWraproundString(String s) {
        int[] a = new int[26];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && (s.charAt(i) - s.charAt(i - 1) == 1 ||
                s.charAt(i - 1) == 'z' && s.charAt(i) == 'a')) {
                k++;
            } else {
                k = 1;
            }

            int j = s.charAt(i) - 'a';
            a[j] = Math.max(a[j], k);
        }

        int ans = 0;
        for (int i = 0; i < 26; i++) {
            ans += a[i];
        }

        return ans;
    }
}