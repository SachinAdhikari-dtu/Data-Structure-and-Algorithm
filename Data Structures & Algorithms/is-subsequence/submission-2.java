class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int index=0;
        for(int i =0 ; i < t.length() ;i++){
            if(index < s.length() && t.charAt(i)==s.charAt(index))index++;
            if(index==s.length())return true;
        }
            if(index==s.length())return true;
            return false;
    }
}