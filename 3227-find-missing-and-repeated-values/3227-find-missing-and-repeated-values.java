class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int[] ans = new int[2];
        int n = grid.length;
        int N = n*n;
        long sumExpected = N*(N+1)/2;
        long sumExpectedSquare = (sumExpected*(2*N+1))/3;
        long sumActual = 0;
        long sumActualSquare = 0;
        for(int[] arr : grid){
            for(int i=0;i<n;i++){
                sumActual += arr[i];
                sumActualSquare += (long) arr[i]*arr[i];
            }
            
        }
        long x = sumActual - sumExpected; // a - b
        long y = (sumActualSquare  - sumExpectedSquare)/x; // a + b

        ans[0] = (int) (x+y)/2;
        ans[1] = (int) (y-x)/2;
        return ans;
     

    }
}