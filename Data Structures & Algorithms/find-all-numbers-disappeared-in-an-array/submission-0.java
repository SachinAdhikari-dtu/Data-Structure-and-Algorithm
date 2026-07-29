class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while( i < nums.length ){
            int curr=nums[i]-1;
            if(nums[i]==nums[curr])i++;
            else{
                int temp=nums[curr];
                nums[curr]=nums[i];
                nums[i]=temp;
            }
        }
        List<Integer> l = new ArrayList<>();
        for( i =0 ; i < nums.length ; i++){
            if(nums[i]!=i+1){
                l.add(i+1);
            }
        }
        return l;
    }
}