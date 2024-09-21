class Solution {
    public int minBitFlips(int start, int goal) {
        int res=0;
        int xor = start^goal;

        while(xor > 0){
            res += xor&1;
            xor>>=1;
        }
    return res;
    }
}