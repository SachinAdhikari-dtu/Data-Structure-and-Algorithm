class Solution {
    public static boolean isValid(int[] arr, int speed, int h) {
        long hours = 0;
        for (int piles : arr) {
            // Calculate hours needed for this pile
            hours += (piles + speed - 1) / speed; // Ceiling division
            if (hours > h) {
                return false; // Early exit if exceeds h
            }
        }
        return hours <= h;
    }
    
    public int minEatingSpeed(int[] arr, int h) {
        // Find the maximum pile size
        int maxPile = 0;
        for (int piles : arr) {
            maxPile = Math.max(maxPile, piles);
        }
        
        int s = 1; // Minimum possible speed
        int e = maxPile; // Maximum possible speed
        int ans = maxPile;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (isValid(arr, mid, h)) {
                // Can finish within h hours, try smaller speed
                ans = mid;
                e = mid - 1;
            } else {
                // Cannot finish within h hours, need faster speed
                s = mid + 1;
            }
        }
        return ans;
    }
}