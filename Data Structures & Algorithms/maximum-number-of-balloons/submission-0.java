class Solution {
    public int maxNumberOfBalloons(String t) {
        int b=0;
        int a=0;
        int l=0;
        int o=0;
        int n=0;
        for(int i =0 ; i < t.length() ;i++){
            char curr=t.charAt(i);
            if(curr=='a')a++;
            if(curr=='b')b++;
            if(curr=='l')l++;
            if(curr=='o')o++;
            if(curr=='n')n++;
        }
        l/=2;
        o/=2;
        int ans=a;
        ans=Math.min(ans,b);
        ans=Math.min(ans,l);
        ans=Math.min(ans,o);
        ans=Math.min(ans,n);
        return ans;
    }
}