class Solution {
    public int findTheWinner(int n, int k) {
        int count = 0;
        for(int i=1;i<=n;i++){
            count = (count+k)%i;
        }  
    return count+1;
    }
}