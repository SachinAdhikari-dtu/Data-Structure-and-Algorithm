class NumArray {
    int p[];
    public NumArray(int[] nums) {
       
        p=new int[nums.length];
        int prev=0;
        for(int i = 0 ; i  < nums.length ; i++){
            prev+=nums[i];
            p[i]=prev;
        }
    }
    
public int sumRange(int left, int right) {
    return left == 0 ? p[right] : p[right] - p[left - 1];
}
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */