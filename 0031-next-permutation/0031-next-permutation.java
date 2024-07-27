class Solution {
    public void nextPermutation(int[] nums) {
         int breakPoint = -1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                breakPoint = i;
                break;
            }
        }
        if(breakPoint == -1) {
            Arrays.sort(nums);
            return;
        }
        //System.out.println(breakPoint);
        for(int j=nums.length-1;j>breakPoint;j--){
            if(nums[j] > nums[breakPoint]){
                 int temp = nums[breakPoint];
                 nums[breakPoint] = nums[j];
                 nums[j] = temp;
                 break;
            }
        }
        
        int i = breakPoint+1;
        int j = nums.length-1;
        while(i<=j){
            int n = nums[i];
            nums[i] = nums[j];
            nums[j] = n;
            i++;
            j--;
        }
       //System.out.println(Arrays.toString(nums));
    }
}