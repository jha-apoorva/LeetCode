class Solution {
    public double minimumAverage(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        int n = nums.length;
        double min = Double.MAX_VALUE;
        double[] averages = new double[n/2];
        for(int i=0; 2*i < n;i++){
            averages[i] = (double)(nums[i]+nums[n-i-1])/2;
            if(averages[i] < min){
                min = averages[i];
            }
        }
    return min;
    }
}