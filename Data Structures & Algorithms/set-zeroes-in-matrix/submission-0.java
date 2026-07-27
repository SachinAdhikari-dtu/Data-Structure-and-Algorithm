class Solution {
    public static void helper(int i , int j , int arr[][]){
        for(int r=i ; r < arr.length ; r++){
            arr[r][j]=0;
        }
        for(int r=i ; r >=0 ; r--){
            arr[r][j]=0;
        }
        for(int c=j ; c < arr[0].length ; c++){
            arr[i][c]=0;
        }

        for(int c=j ; c >-1 ; c--){
            arr[i][c]=0;
        }


    }
    public void setZeroes(int[][] nums) {
        
        boolean arr[][]=new boolean[nums.length][nums[0].length];
        for(int i =0 ; i < arr.length ; i++){
            for(int j =0 ; j < arr[0].length ; j++){
                if(nums[i][j]==0){
                    arr[i][j]=true;
                }
            }
        }

        for(int i =0 ; i < arr.length ; i++){
            for(int j =0 ; j < arr[0].length ; j++){
                if(nums[i][j]==0 && arr[i][j]){
                   helper(i,j,nums);
                }
            }
        }


    }
}
