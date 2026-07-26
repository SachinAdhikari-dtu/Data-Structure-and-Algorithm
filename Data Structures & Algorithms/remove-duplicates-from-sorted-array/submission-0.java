class Solution {
    public int removeDuplicates(int[] nums) {
        int p=-1;
        int index=0;
        for(int i= 0 ; i < nums.length ; i++){
            if(p!=nums[i]){
                nums[index++]=nums[i];
            }
            p=nums[i];

        }
        return index;
    }
}