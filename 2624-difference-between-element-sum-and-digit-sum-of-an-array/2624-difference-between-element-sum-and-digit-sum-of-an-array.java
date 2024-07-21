class Solution {
    public int differenceOfSum(int[] nums) {
        int sumEle = 0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            sumEle += nums[i];
        }
        int sumDigit = 0;
        for(int i : nums){
            while(i != 0){
                int digit = i%10;
                sumDigit += digit;
                i=i/10;
            }
        }
        return Math.abs(sumEle-sumDigit);
    }
}