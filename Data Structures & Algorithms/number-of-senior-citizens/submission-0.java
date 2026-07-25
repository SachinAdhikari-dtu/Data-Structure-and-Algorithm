class Solution {
    public int countSeniors(String[] d) {
        int ans=0;
        for(int i =0 ; i < d.length ; i++){
            int age=0;
            String str=d[i];
            age+=str.charAt(11)-'0';
            age*=10;
            age+=str.charAt(12)-'0';
            if(age > 60)ans++;
        }
        return ans;
    }
}