class Solution {
    public int findGCD(int[] nums) {
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i] > mx)
            mx = nums[i];
            if(nums[i] < mn)
            mn = nums[i];
        }
        int i = mn-1;
        if(mx % mn == 0){
            return mn;
        }
        else {
            while(i != 0){
                if(mx%i == 0 && mn%i == 0)
                break;
                else
                i--;
            }
        }
    return i;
    }
}