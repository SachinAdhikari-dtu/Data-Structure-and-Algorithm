class Solution {
    public int[] countBits(int n) {
     int ans[]=new int[n+1];
     for(int i =1 ; i <=n ;i++){
        ans[i]=help(i);
     }   

     return ans;
    }
    public static int help(int n){
        int ans=0;
        while(n>0){
            if((n&1)==1)ans++;
            n=n>>1;
        }return ans;
    }
}
