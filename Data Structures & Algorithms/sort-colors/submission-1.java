class Solution {
    public void sortColors(int[] nums) {
        int s=0;
        int m =0 ;
        int e=nums.length -1;
        while(m<=e){
            if(nums[m]==0){
                int temp=nums[m];
                nums[m]=nums[s];
                nums[s]=temp;

                s++;
                m++;
            }else if(nums[m]==1){
                m++;
            }else{
                int tmep=nums[m];
                nums[m]=nums[e];
                nums[e]=tmep;
                e--;
            }
        }
    }
}