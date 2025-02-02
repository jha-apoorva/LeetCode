class Solution {
    public int isInc(int[] nums){
        int pivot=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] < nums[i-1]){
                pivot = i;
                break;
            }
        }
    return pivot;
    }
    public boolean check(int[] nums) {
        int p = isInc(nums);
        int[] arr = new int[nums.length];
        int n = arr.length;
        for(int i=0; i<n;i++){
            arr[i] = nums[(i+p) % n];
            }
        if(isInc(arr)==0)
        return true;
        else
        return false;     
    }
}

