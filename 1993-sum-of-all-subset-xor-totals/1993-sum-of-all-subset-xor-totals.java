class Solution {
    public int subsetXORSum(int[] nums) {
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum |= nums[i];
        }
    //return totalSum * (int) (Math.pow(2,(nums.length-1)));
    return totalSum << nums.length-1;
    }
}