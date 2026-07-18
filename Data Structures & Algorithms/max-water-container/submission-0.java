class Solution {
    public int maxArea(int[] nums) {
        int ans=0;
        int s=0;
        int e=nums.length-1;
        while(s<=e){
            int curr=(e-s)*Math.min(nums[s],nums[e]);
            ans=Math.max(ans,curr);
            if(nums[s] > nums[e]){
                e--;
            }else{
                s++;
            }
        }
        return ans;
    }
}
