class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = nums[0];
        int maxCurr = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i] > nums[i-1]){
                maxCurr += nums[i];
            } else {
                maxCurr = nums[i];
            }
            if(maxCurr > maxSum) maxSum =  maxCurr;
        }
    return maxSum;
    }
}