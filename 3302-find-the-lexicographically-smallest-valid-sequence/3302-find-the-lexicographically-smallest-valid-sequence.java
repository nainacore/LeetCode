class Solution {
    public int[] validSequence(String word1, String word2) {
       int n = word1.length();
        int m = word2.length();

        // suffix[i] = number of characters of word2
        // that can be matched from word1[i...]
        int[] suffix = new int[n + 1];

        int j = m - 1;

        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1];

            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                suffix[i]++;
                j--;
            }
        }

        int[] ans = new int[m];

        int p = 0;
        boolean changed = false;

        for (int i = 0; i < n && p < m; i++) {

            // Normal matching
            if (word1.charAt(i) == word2.charAt(p)) {
                ans[p++] = i;
            }

            // Use our one allowed mismatch
            else if (!changed) {
                int remaining = m - p - 1;

                if (suffix[i + 1] >= remaining) {
                    ans[p++] = i;
                    changed = true;
                }
            }
        }

        if (p == m)
            return ans;

        return new int[0];

    }
}