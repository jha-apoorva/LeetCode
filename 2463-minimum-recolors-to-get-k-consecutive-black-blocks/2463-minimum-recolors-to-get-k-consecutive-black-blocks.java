class Solution {
    public int minimumRecolors(String blocks, int k) {
        int blacks = 0;
        int ans = Integer.MAX_VALUE;

        for(int i=0;i<blocks.length();i++){
            if(i-k >= 0 && blocks.charAt(i-k) == 'B') blacks--;
            if(blocks.charAt(i) == 'B') blacks++;
            ans = Math.min(ans,k-blacks);
        }
    return ans;
    }
}