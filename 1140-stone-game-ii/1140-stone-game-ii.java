class Solution {
    int[][] dp;
    int[] s;

    public int stoneGameII(int[] p) {
        int n = p.length;
        dp = new int[n][n + 1];
        s = new int[n + 1];

        for (int i = n - 1; i >= 0; i--)
            s[i] = s[i + 1] + p[i];

        return f(0, 1);
    }

    int f(int i, int m) {
        int n = s.length - 1;
        if (i == n) return 0;
        if (2 * m >= n - i) return s[i];
        if (dp[i][m] != 0) return dp[i][m];

        for (int x = 1; x <= 2 * m; x++)
            dp[i][m] = Math.max(dp[i][m],
                s[i] - f(i + x, Math.max(m, x)));

        return dp[i][m];
    }
}