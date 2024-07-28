class Solution {
    public int longestSubarray(int[] nums) {
        int curr=0;
        int prev=0;
        int count=0;
        for(int i : nums){
            if(i==1){
                curr++;
            }
            else{
                count=Math.max(count,curr+prev);
                prev=curr;
                curr=0;
            }
        }
        count = Math.max(count,curr+prev);
        return count == nums.length?count-1:count;
    }
}