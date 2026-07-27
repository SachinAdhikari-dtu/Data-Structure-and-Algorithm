class Solution {
    public static void rotate(int arr[] , int s , int e){
       while(s < e){
        int temp=arr[s];
        arr[s]=arr[e];
        arr[e]=temp;
        s++;
        e--;
       }
    }
    public void rotate(int[] nums, int k) {
        k%=nums.length;
        rotate(nums,0,nums.length-1);
        rotate(nums,0,k-1);
        rotate(nums,k,nums.length-1);
    }
}