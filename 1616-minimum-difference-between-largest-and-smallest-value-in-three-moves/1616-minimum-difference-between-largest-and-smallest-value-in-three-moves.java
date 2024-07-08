class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        if(nums.length <= 4)
        return 0;
        else{
            int a = Math.min(nums[nums.length-4]-nums[0],nums[nums.length-3]-nums[1]);
            int b = Math.min(a,nums[nums.length-2]-nums[2]);
            return Math.min(b,nums[nums.length-1]-nums[3]);
        }
        
    }
}