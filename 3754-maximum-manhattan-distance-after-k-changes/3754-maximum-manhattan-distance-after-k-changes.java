class Solution {
    public int maxDistance(String s, int k) {
       int ans = 0;
       int N=0,S=0,W=0,E = 0;
       for(char ch : s.toCharArray()) {
        switch(ch) {
            case 'N':
                N++;break;
            case 'S':
                S++;break;
            case 'W':
                W++;break;
            case 'E':
                E++;break;

        }
        int vertical = Math.min(Math.min(N,S),k);
        int horizontal = Math.min(Math.min(W,E),k-vertical);

        ans = Math.max(ans,((Math.abs(N-S)+vertical*2)+(Math.abs(W-E)+horizontal*2)));

       }
    return ans;

    }
}