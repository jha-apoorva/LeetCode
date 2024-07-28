class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] sumLeft = new int[n];
        int[] sumRight = new int[n];
        for(int k=1;k<n;k++){
            int i=0;
            while(i < k){
            sumLeft[k]+=nums[i];
            i++;
        }
        }
        for(int k=0;k<n-1;k++){
            int i=k+1;
            while(i > k && i<n){
            sumRight[k]+=nums[i];
            i++;
        }
        }
        for(int i=0;i<n;i++){
            if(sumLeft[i] == sumRight[i]){
                return i;
            }
        }
        //System.out.println(Arrays.toString(sumLeft));
        //System.out.println(Arrays.toString(sumRight));
        return -1;
    }
}