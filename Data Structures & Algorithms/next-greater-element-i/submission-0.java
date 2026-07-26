class Solution {
   
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length];
        for(int i=0 ; i < nums1.length ;i++){
            int val=nums1[i];
            int index=0;
            while(index < nums2.length){
                if(nums2[index]==val)break;
                index++;
            }
            if(index==nums2.length){
                ans[i]=-1;

            }else{

                int curr=val;
                while(index < nums2.length){
                    if(nums2[index] > val){
                        ans[i]=nums2[index];
                        break;
                    }
                    index++;
                }

                if(  index >= nums2.length    )ans[i]=-1;




            }
        }
        return ans;
    }
}