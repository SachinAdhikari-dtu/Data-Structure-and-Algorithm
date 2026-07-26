class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m+n-1;
        n--;
        m--;

        while(m>=0 || n>=0 || i>=0 ){
            if(n<0 ){
                nums1[i--]=nums1[m--];
                continue;
            }
            if(m<0){
                nums1[i--]=nums2[n--];
                 continue;
            }
            if(nums1[m] > nums2[n]){
                nums1[i--]=nums1[m--];
            }else if(n>=0){
                nums1[i--]=nums2[n--];
            }
        }
    }
}