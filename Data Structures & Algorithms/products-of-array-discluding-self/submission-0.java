class Solution {
    public int[] productExceptSelf(int[] nums) {
        int f=0;
        int p=1;
        int arr[]=new int[nums.length];
        for(int i =0 ; i < nums.length ;i++){
            if(nums[i]==0){
                f++;
            }else{
                p*=nums[i];
            }
        }

        for(int i =0 ; i < nums.length ;i++){
            
            if(nums[i]!=0 && f ==0){
                arr[i]=p/nums[i];
            }else{

                if(f==0){
                    arr[i]=p;
                   
                }else {
                    arr[i]=0;
                }

                if(f==1 && nums[i]==0){
                    arr[i]=p;
                }

            }
        }
        return arr;

    }
}  
