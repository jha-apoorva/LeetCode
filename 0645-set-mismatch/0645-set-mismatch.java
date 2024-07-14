class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[2];
        int i=0;
        while(i < nums.length){
            int crct = nums[i]-1;
            if(nums[i] != nums[crct]){
                int temp = nums[i];
                nums[i] = nums[crct];
                nums[crct] = temp;
            }
            else
            i++;
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1){
                arr[0] = nums[j];
                arr[1] = j+1;
            }
        }
        return arr;
    }
}