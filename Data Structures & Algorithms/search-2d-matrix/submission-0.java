class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;
        int s = 0;
        int e = rows * cols - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            int r = m / cols;
            int c = m % cols;
            if (arr[r][c] == target) {
                return true;
            } else if (arr[r][c] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return false;
    }
}