class Solution {
    public static double mypow(double x , int n){
        if(n==0)return 1;
        if(n==1)return x;
        double a=mypow(x,n/2);
        double b=a*a;
        if(n%2!=0){
            b*=x;
        }
        return b;
    }
    public double myPow(double x, int n) {
       double ans=mypow(x,Math.abs(n));
       if(n<0)return 1.0/ans;
       return ans;
    }
}
