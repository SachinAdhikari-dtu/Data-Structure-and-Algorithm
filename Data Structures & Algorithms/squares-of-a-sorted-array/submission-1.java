class Solution {
    public int[] sortedSquares(int[] nums) {
        int arr[]=new int[nums.length];
        int index=nums.length-1;
        int e=nums.length-1;
        int s=0;
        while(s<=e){
            int l=nums[s]*nums[s];
            int r=nums[e]*nums[e];
            if(l > r){
                    arr[index--]=l;
                    s++;
            }else{
                arr[index--]=r;
                e--;
            }
        }
        return arr;

    }
}