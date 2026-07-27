class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str=strs[0];
        for(int i = 1 ; i < strs.length ; i++){
            String ans=strs[i];
            int j = 0 ;
            while( j < ans.length()  && j < str.length()  && ans.charAt(j)==str.charAt(j)){
                j++;
            }
            str=ans.substring(0,j);
        }
        return str;
    }
}