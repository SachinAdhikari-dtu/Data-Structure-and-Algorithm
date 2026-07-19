class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean arr[][] = new boolean[grid.length][grid[0].length];
        int ans = 0;
        int d[][] = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int curr = 0;
                if (!arr[i][j] && grid[i][j] == 1) {
                    globalAns = 0;
                    helper(grid, arr, i, j, d, 1);
                    curr = globalAns;
                }
                ans = Math.max(ans, curr);
            }
        }

        return ans ;
    }
    static int globalAns = 0;
    public static void helper(int grid[][], boolean arr[][], int r, int c, int d[][], int ans) {
        arr[r][c] = true;
        globalAns++;

        for (int i = 0; i < 4; i++) {
            int row = r + d[i][0];
            int col = c + d[i][1];
            if (isValid(row, col, arr)) {
                if (grid[row][col] == 0)
                    continue;
                helper(grid, arr, row, col, d, ans);
            }
        }
    }
    public static boolean isValid(int r, int c, boolean arr[][]) {
        if (r >= arr.length || r < 0 || c >= arr[0].length || c < 0)
            return false;
        if (arr[r][c])
            return false;
        return true;
    }
}
