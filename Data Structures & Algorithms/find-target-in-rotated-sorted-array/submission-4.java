class Solution {
    public static int help(int s , int e , int nums[] ,int target){
        while(s <= e){
            int m = s +(e-s)/2;
            if(nums[m]==target)return m;
            else if(nums[m] > target){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return -1;
    }
    public static int roated(int nums[]){
    int s=0;
        int e=nums.length-1;
        while(s<=e){
            int m = s + (e-s)/2;
            if( nums.length > m+1 && nums[m] > nums[m+1]){
                return m;
            }else if(m > 0 && nums[m-1] > nums[m]){
                return m-1;
            }

            if(nums[s] > nums[m]){
                e=m-1;
            }else{
                s=m+1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
    
    int index=roated(nums);
    if(index==-1)return help(0,nums.length-1,nums,target);
    int ans=help(0,index,nums,target);
    if(ans==-1)return help(index+1,nums.length-1,nums,target);
    return ans;
       
    }
}
