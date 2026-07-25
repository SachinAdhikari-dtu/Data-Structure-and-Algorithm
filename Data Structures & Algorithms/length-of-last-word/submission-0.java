class Solution {
    public int lengthOfLastWord(String s) {
        int index=s.length()-1;
        int ans=0;
        while(index>=0){
            char curr=s.charAt(index);
            if(curr==' ')index--;
            else break;
        }

        while(index>=0 && !(s.charAt(index)==' ')){
            ans++;
            index--;
        }

        return ans;

    }
}