class Solution {
    public int missingNumber(int[] nums) {
        int ans=0;
        for(int i =0 ; i < nums.length ;i++){
            ans^=nums[i];
        }
        int n=0;
        int m = nums.length;
        if(m%4==0){
            n=m;
        }else if(m%4==1){
            n=1;
        }else if(m%4==2){
            n=m+1;
        }else{
            n=0;
        }
        return ans^n;
    }
}
