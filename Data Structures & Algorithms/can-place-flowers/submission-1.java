class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] dp = new int[flowerbed.length + 1];
        Arrays.fill(dp, -1);
        int maxFlowers = help(flowerbed, 0, dp);
        return maxFlowers >= n;
    }
    
    private int help(int[] flowerbed, int i, int[] dp) {
        if (i >= flowerbed.length) return 0;
        if (dp[i] != -1) return dp[i];
        
        // Option 1: Skip current position
        int skip = help(flowerbed, i + 1, dp);
        
        // Option 2: Plant at current position (if possible)
        int plant = 0;
        if (flowerbed[i] == 0) {
            // Check if we can plant here
            boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
            boolean rightEmpty = (i == flowerbed.length - 1) || (flowerbed[i + 1] == 0);
            
            if (leftEmpty && rightEmpty) {
                // Plant and move to i+2 (since next position will be occupied)
                plant = 1 + help(flowerbed, i + 2, dp);
            }
        }
        
        dp[i] = Math.max(skip, plant);
        return dp[i];
    }
}