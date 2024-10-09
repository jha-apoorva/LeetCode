class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        int ans = n;
        for(i=1;i<=n;i++){
            ans-=i;
            if (ans <= 0) break;
        }
        return ans<0?i-1:i;
    }
}