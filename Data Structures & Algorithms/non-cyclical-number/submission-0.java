class Solution {
    public static int help(int n){
        int ans=0;
        while(n>0){
            int curr=n%10;
            n/=10;
            ans+=curr*curr;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> s=new HashSet<>();
        while(true){
            if(s.contains(n))return false;
            s.add(n);
            n=help(n);
            if(n==1)return true;

        }
    }
}
