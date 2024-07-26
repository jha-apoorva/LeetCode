class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuffer sb = new StringBuffer(s);
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(j);
            if(ch1 != ch2){
                if((int) ch1 < (int) ch2){
                    sb.setCharAt(j,ch1);
                }
                else{
                    sb.setCharAt(i,ch2);
                }
            }
        i++;j--;
        }
    return sb.toString();
    }
}