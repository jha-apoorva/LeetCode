class Solution {
    public int titleToNumber(String columnTitle) {
        int ans=0;
        for(int i=0;i<columnTitle.length();i++){
            char curr = columnTitle.charAt(i);
            int value = curr-'A'+1;
        ans = ans*26+value;
        }
    return ans;
    }
}