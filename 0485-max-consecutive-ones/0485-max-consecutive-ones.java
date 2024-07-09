class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countTillNow = 0;
        int count = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                countTillNow++;
                count = Math.max(count,countTillNow);
            }
            else{
                countTillNow = 0;
            }
        }
    return count;
    }
}