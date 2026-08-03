class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        int s=0;
        int e=nums.length-1;
        int m =0;
        while(s < e){
             m = s +(e-s)/2;
            
            if(  m < nums.length-1 &&   nums[m] > nums[m+1]){
                e=m;
            }else if(m < nums.length-1 && nums[m] < nums[m+1]){
                s=m+1;
            }

            if(s==e)return s;
            
           
        }
        return -1;
    }
}