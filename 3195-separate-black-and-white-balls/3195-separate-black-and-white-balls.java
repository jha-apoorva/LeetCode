class Solution {
    public long minimumSteps(String s) {
        int black = 0;
        long ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0') ans += (long) black;
            else black++;
        }
    return ans;
    }
}