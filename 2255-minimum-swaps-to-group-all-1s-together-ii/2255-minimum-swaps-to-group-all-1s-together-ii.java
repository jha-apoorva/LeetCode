class Solution {
    public int minSwaps(int[] nums) {
        int swaps = Integer.MAX_VALUE;
        int numOnes = 0;
        for(int n : nums){
            if(n==1) numOnes++;
        }
        int currZero = 0;
        for(int i=0;i<numOnes;i++){
            if(nums[i]==0)
            currZero++;
        }
        for(int i=1;i<2*nums.length;i++){
            if(nums[(i-1)%nums.length] == 0)
            currZero--;
            if(nums[(i+numOnes-1)%nums.length]==0)
            currZero++;
            swaps = Math.min(currZero,swaps);
        }
    return swaps;
    }
}