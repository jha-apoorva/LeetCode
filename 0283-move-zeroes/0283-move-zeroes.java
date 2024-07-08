class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0;
        int j = i;
        while(j < nums.length){
            if(nums[j] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;  
                i++;
            }
            j++;
               
        }
    }
}