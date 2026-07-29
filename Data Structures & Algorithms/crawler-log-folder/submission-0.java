class Solution {
    public int minOperations(String[] logs) {
        int ans=0;
        for(int i =0 ; i < logs.length ;i++){
            String str=logs[i];
            if(str.equals("../")){
                if(ans!=0)ans--;
            }else if(str.equals("./")){
                //do nothing
                int b=0;
            }else if(str.equals("x/")){
                ans++;
            }else{
                ans++;
            }
        }
        return ans;

    }
}