class Solution {
    public int search(int[] nums, int target) {
        int s=0;
        int e=nums.length - 1;
        while(s<=e){
            int m = e-s;
            if(nums[m]==target){
                return m;
            }else if ( nums[m] < target){
                e--;
            }else{
                s++;
            }
        }
        return -1;
    }
}
