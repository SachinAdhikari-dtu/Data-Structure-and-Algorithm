class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb  = new StringBuilder();
        int c=0;
        int i=a.length()-1;
        int j=b.length()-1;
        while( i >=0 || j >=0 || c >0){
            int m=c;
            if(i >=0 ){
                m+=a.charAt(i--)-'0';
            }
            if(j >=0 ){
                m+=b.charAt(j--)-'0';
            }
            c=m/2;
            sb.append(m%2);
        }
        return sb.reverse().toString();
    }
}