class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq = new int[501];
        for(int n : nums){
            freq[n]++;
        }
        for(int i=1;i<501;i++){
            if(freq[i] % 2 != 0) return false;
        }
    return true;
    }
}