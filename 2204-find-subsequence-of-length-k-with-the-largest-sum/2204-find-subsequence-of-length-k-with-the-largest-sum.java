class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] auxArr = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            auxArr[i][0] = nums[i];
            auxArr[i][1] = i;
        }
        
        Arrays.sort(auxArr, (a, b) -> Integer.compare(b[0], a[0]));
        Arrays.sort(auxArr, 0, k, (a, b) -> Integer.compare(a[1], b[1]));

        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = auxArr[i][0];
        }
    return res;
    }
}