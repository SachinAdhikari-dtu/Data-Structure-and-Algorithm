class Solution {
    public int reverse(int x) {
        if( x > Integer.MAX_VALUE )return 0;
        long ans=0;
        boolean negative=x <0;
        x=Math.abs(x);

        while( x > 0){
            ans*=10;
            ans+=x%10;
            x/=10;
            if(ans > Integer.MAX_VALUE)return 0;
        }
        if(negative)return -1*(int)(ans);
        return (int)(ans);
    }
}
