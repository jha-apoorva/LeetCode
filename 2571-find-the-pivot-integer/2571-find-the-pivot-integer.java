class Solution {
    public int pivotInteger(int n) {
        int pivot = -1;
        int sumTillNow = 0;
        int totalSum = (n*(n+1))/2;
        for(int i=1;i<=n;i++){
            sumTillNow += i;
            if(sumTillNow == (totalSum - sumTillNow)+i){
                pivot = i;
                break;
            }
        }
    return pivot;
    }
}