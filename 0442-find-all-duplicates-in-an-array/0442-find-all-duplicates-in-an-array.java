class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i < nums.length){
            int c = nums[i]-1;
            if(nums[i] != nums[c]){
                int temp = nums[i];
                nums[i] = nums[c];
                nums[c] = temp;
            }
            else
            i++;
        }
        List<Integer> arr = new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j] != j+1)
            arr.add(nums[j]);
        }
    return arr;
    }
}