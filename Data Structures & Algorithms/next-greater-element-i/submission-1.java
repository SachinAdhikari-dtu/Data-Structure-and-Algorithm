class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0 ; i < nums2.length ; i++){
            int val=nums2[i];
            map.put(val,i);
        }

        int ans[]=new int[nums1.length];
        for(int i =0 ; i < ans.length ; i++){
            int index=map.get(nums1[i])+1;
            int val=nums1[i];
            while(  nums2.length > index  &&    val > nums2[index]){
                index++;
            }
            if(index!=nums2.length){
                ans[i]=nums2[index];
            }else{
                ans[i]=-1;
            }
        }
        return ans;

    }
}