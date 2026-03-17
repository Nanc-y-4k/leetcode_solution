class Solution {
    public int largestSubmatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] height = new int[n];
        int maxArea = 0;

        for (int i = 0; i < m; i++) {

            // Step 1: Build heights
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 1)
                    height[j]++;
                else
                    height[j] = 0;
            }

            // Step 2: Copy and sort
            int[] temp = height.clone();
            java.util.Arrays.sort(temp);

            // Step 3: Calculate max area
            for (int j = 0; j < n; j++) {
                int h = temp[n - 1 - j]; // descending
                int width = j + 1;
                maxArea = Math.max(maxArea, h * width);
            }
        }

        return maxArea;
    }
}