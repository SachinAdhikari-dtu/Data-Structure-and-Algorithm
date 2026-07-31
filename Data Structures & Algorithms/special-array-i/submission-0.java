class Solution {
    public static boolean iseven(int n){
        if(n%2==0)return true;
        return false;
    }
    public boolean isArraySpecial(int[] nums) {
        for(int i = 1 ; i < nums.length -1 ; i++){
            int curr=nums[i];
            int prev=nums[i-1];
            int forward=nums[i+1];

            if(iseven(curr)==iseven(prev))return false;
            if(iseven(forward)==iseven(curr))return false;

        }return true;
    }
}