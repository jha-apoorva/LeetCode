class Solution {
    public int search(int[] nums, int target) {
        int peak = findPivot(nums);
        if(peak == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        int res = binarySearch(nums,target,0,peak);
        if(res == -1){
            return binarySearch(nums,target,peak+1,nums.length-1);
        }
        return res;
    }
    public int findPivot(int[] nums){
        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            if(mid > start && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            if(nums[start] >= nums[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
    public int binarySearch(int[] nums,int target,int start,int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return -1;
    }
}