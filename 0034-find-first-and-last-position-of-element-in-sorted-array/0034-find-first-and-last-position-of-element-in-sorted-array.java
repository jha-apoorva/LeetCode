class Solution {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] arr = {-1,-1};
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target > nums[mid]){
                start =  mid+1;
            }
            else if(target < nums[mid]){
                end = mid-1;
            }
            else{
                for(int i=mid;i>=start;i--){
                    if(nums[i] == target)
                    arr[0] = i;
                }
                 for(int i=mid;i<=end;i++){
                    if(nums[i] == target)
                    arr[1] = i;
                }
                return arr;
                
            }
        }
        return arr;
    }
}