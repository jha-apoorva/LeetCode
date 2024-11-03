class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        return nums[n]*nums[n-1] - nums[0]*nums[1];
    }
}