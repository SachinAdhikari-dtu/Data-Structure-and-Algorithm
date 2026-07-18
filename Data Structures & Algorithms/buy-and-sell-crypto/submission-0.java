class Solution {
    public int maxProfit(int[] arr) {
        int ans=0;
        int buy=arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            int curr=arr[i]-buy;
            ans=Math.max(ans,curr);
            buy=Math.min(buy,arr[i]);
        }
        return ans;
    }
}
