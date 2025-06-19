class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int countSubArray = 1;
        int start = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] - nums[start] > k){
                countSubArray++; 
                start = i;   
            }
        }
    return countSubArray;
    }
}