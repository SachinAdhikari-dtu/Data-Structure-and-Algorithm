class Solution {
    public int trap(int[] height) {
       int l[]=new int[height.length]; 
       int r[]=new int[height.length]; 
       int ans=0;
       int p=height[0];
       for(int i =0 ; i < l.length ; i++){
        l[i]=Math.max(p,height[i]);
        p=Math.max(p,height[i]);
       }

        p=height[l.length-1];



       for(int i =l.length-1 ; i >=0 ; i--){
        r[i]=Math.max(p,height[i]);
        p=Math.max(p,height[i]);
       }

        for(int i = 0; i < l.length ; i++){
            ans+=Math.abs(Math.min(l[i],r[i])-height[i]);
        }
return ans;

    }
}
