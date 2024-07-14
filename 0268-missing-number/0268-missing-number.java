class Solution {
    public int missingNumber(int[] nums) {
        /*int n = nums.length;
        // 0 - n numbers will be present if length would be n+1
         Arrays.sort(nums);
         int x = n;
         for(int i=0;i<n;i++){
            if(nums[i] != i){
                x=i;
                break;
            }
         }
    return x;*/

    int i=0;
    while(i < nums.length){
        int correct = nums[i];
        if(nums[i] < nums.length && nums[i] != nums[correct]){
            int temp = nums[i];
            nums[i] = nums[correct];
            nums[correct] = temp;
        }
        else {
            i++;
        }
    }
    for(int j=0; j< nums.length;j++){
        if(nums[j] != j)
        return j;
    }
    return nums.length;
    }
}