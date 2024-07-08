class Solution {
    public int passThePillow(int n, int time) {
        int i = time/(n-1);
        int j = time%(n-1);

        return i%2==0 ? j+1:n-j;
    }
}