class Solution {
    public int[] bubbleSort(int[] nums){
      int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return nums;
    }
    public int[] numberGame(int[] nums) {
      nums = bubbleSort(nums);
      int n = nums.length;
      int i=0;
      int j=i+1;
      while(j<n){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        i+=2;
        j+=2;
      }
    return nums; 
    }
}