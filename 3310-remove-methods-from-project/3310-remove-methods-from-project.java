import java.util.*;

class Solution {
    List<Integer>[] g;
    boolean[] bad;

    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
        g = new ArrayList[n];
        for (int i = 0; i < n; i++) g[i] = new ArrayList<>();

        for (int[] e : invocations)
            g[e[0]].add(e[1]);

        bad = new boolean[n];
        dfs(k);

        for (int[] e : invocations)
            if (!bad[e[0]] && bad[e[1]]) {
                List<Integer> ans = new ArrayList<>();
                for (int i = 0; i < n; i++) ans.add(i);
                return ans;
            }

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (!bad[i]) ans.add(i);

        return ans;
    }

    void dfs(int u) {
        if (bad[u]) return;
        bad[u] = true;
        for (int v : g[u])
            dfs(v);
    }
}