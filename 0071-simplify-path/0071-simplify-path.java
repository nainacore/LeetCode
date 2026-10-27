class Solution {
    public String simplifyPath(String path) {
        String[] s = path.split("/");
        Stack<String> st = new Stack<>();

        for (String x : s) {
            if (x.equals("") || x.equals(".")) {
                continue;
            } else if (x.equals("..")) {
                if (!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(x);
            }
        }

        return "/" + String.join("/", st);
    }
}