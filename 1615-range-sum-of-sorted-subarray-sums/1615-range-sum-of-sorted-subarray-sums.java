class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int MOD = (int) Math.pow(10,9)+7;
        int[] sumArray = new int[n*(n+1)/2];
        int indx=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum += nums[j];
                sumArray[indx++] = sum;
            }
        }
        Arrays.sort(sumArray);
        int ans=0;
        for(int i=left-1;i<right;i++)
        ans = (ans + sumArray[i])%MOD;
    return ans%MOD;
    }
}