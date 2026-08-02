class Solution {
    public int maxDepth(String s) {
        int ans=0;
        int result=0;
        for(int i =0 ; i < s.length() ;i++){
            char curr=s.charAt(i);
            if(curr=='('){
                ans++;
            }else if(curr==')')ans--;
        result=Math.max(result,ans);
        }
        return result;
    }
}