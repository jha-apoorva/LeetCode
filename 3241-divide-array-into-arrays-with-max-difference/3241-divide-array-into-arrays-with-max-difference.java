class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] arr = new int[nums.length/3][3];
        
        int z = 0;
        int i=0;
        for(i=0;i<arr.length;i++){
            int j=0;
            int diff=0;
            for(j=0;j<3;j++){
                arr[i][j] = nums[z];
                z++;
                if(arr[i][2]-arr[i][0] > k){
                    return new int[0][];
                }
            }
        }
    return arr;  
    }
}