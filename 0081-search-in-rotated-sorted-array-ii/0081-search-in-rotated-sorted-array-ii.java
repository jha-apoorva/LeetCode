class Solution {
    public boolean search(int[] nums, int target) {
        int peak = findPivotWithDuplicates(nums);
        if(peak == -1){
            return binarySearch(nums,target,0,nums.length-1);
        }
        boolean res = binarySearch(nums,target,0,peak);
        if(res == false){
            return binarySearch(nums,target,peak+1,nums.length-1);
        }
        return res;
    }
    public int findPivotWithDuplicates(int[] nums){
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
            if(nums[mid] == nums[start] && nums[mid] == nums[end]){
                if(start < nums.length-1 && nums[start] > nums[start+1]){
                    return start;
                }
                start++;
                if(end > 0 && nums[end] < nums[end-1]){
                    return end-1;
                }
                end--;
            }
            else if(nums[start] < nums[mid] || nums[start] == nums[mid] && nums[mid] > nums[end]){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
       }
        return -1;
    }
    public boolean binarySearch(int[] nums,int target,int start,int end){
        while(start <= end){
            int mid = start + (end-start)/2;
            if(nums[mid] == target){
                return true;
            }
            else if(nums[mid] < target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return false;
    }
}