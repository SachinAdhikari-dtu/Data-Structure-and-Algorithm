class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       int ans=0;
       int f=0;
       for(int i =0 ; i < nums.length ;i++){
        if(nums[i]==1){
            f++;
            ans=Math.max(ans,f);
        }else{
            f=0;
        }
       } 

       return ans;
    }
}