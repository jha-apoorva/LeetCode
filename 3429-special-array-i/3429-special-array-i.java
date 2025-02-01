class Solution {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;
        if(n==1) return true;
        int parity = nums[0]%2;
        for(int i=1;i<n;i++){
            if(nums[i]%2==parity) return false;
            parity = nums[i]%2;
        }
    return true;
    }
}