class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        // 0 - n numbers will be present if length would be n+1
         Arrays.sort(nums);
         int x = n;
         for(int i=0;i<n;i++){
            if(nums[i] != i){
                x=i;
                break;
            }
         }
    return x;
    }
}