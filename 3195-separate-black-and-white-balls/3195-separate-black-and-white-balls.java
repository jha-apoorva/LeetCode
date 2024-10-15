class Solution {
    public long minimumSteps(String s) {
        /*int black = 0;
        long ans = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0') ans += (long) black;
            else black++;
        }
    return ans;*/
    long white = 0;
    long ans=0;
    for(int i=s.length()-1;i>=0;i--){
        if(s.charAt(i) == '0') white++;
        else ans += white;
    }
    return ans;
    }
}