class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        left[0] = 1;
        right[nums.length-1] = 1;

        for(int i=1;i<nums.length;i++){
            left[i] = left[i-1]*nums[i-1];
        }
        for(int i=nums.length-2;i>=0;i--){
            right[i] = nums[i+1]*right[i+1];
        }
        for(int i=0;i<nums.length;i++){
            answer[i] = right[i]*left[i];
        }
    return answer;
    }
}