class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n=nums[1]*nums[0];
        int n1=nums[nums.length-1]*nums[nums.length-2];
    return n1-n;
    }
}