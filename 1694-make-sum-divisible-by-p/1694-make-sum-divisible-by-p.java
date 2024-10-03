class Solution {
    public int minSubarray(int[] nums, int p) {
        int moduloSum=0;
        for(int i:nums) moduloSum = (moduloSum+i)%p;
        if(moduloSum == 0) return 0;
        HashMap<Integer,Integer> rem = new HashMap<>();
        rem.put(0,-1);
        int ans = nums.length , remainingSum=0;
        for(int i=0;i<nums.length;i++){
            remainingSum = (remainingSum+nums[i])%p;
            int target = (remainingSum-moduloSum+p)%p;
            if(rem.containsKey(target)){
                ans = Math.min(ans,i-rem.get(target));
            }
            rem.put(remainingSum,i);
        }
        return ans==nums.length?-1:ans;
    }
}