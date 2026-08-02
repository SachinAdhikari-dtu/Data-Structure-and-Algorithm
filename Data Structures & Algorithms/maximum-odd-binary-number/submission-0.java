class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0;
        int zero=0;
        for(int i =0 ; i < s.length()   ;i++){
            int curr=s.charAt(i)-'0';
            if(curr==1)one++;
            if(curr==0)zero++;
        }

        StringBuilder sb = new StringBuilder();
        while(one >1){
            sb.append("1");
            one--;
        }
        while(zero >0){
            sb.append("0");
            zero--;
        }
        sb.append("1");

        return sb.toString();



    }
}