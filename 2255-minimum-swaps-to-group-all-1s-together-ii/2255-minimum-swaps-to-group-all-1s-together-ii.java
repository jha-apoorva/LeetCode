class Solution {
    public int minSwaps(int[] nums) {
        int swaps = Integer.MAX_VALUE;
        int n = nums.length;
        int numOnes = 0;
        for(int i : nums){
            if(i==1) numOnes++;
        }
        int currZero = 0;
        for(int i=0;i<numOnes;i++){
            if(nums[i]==0)
            currZero++;
        }
        for(int i=1;i<2*n;i++){
            if(nums[(i-1)%n] == 0)
            currZero--;
            if(nums[(i+numOnes-1)%n]==0)
            currZero++;
            swaps = Math.min(currZero,swaps);
        }
    return swaps;
    }
}