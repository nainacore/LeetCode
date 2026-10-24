class Solution {
    public int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];

        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int k = 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++)
                a[top][i] = k++;
            top++;

            for (int i = top; i <= bottom; i++)
                a[i][right] = k++;
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    a[bottom][i] = k++;
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    a[i][left] = k++;
                left++;
            }
        }

        return a;
    }
}