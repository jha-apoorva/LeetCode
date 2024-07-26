class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int i=n%2==0?0:1;
        int j=res.length-1;
            while(i <= j){
                res[i] = n;
                res[j] = -n;
                i++;j--;
                n--;
    }
    return res;
    }
}