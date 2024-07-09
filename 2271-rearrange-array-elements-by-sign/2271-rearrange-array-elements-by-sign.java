class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] onlyPos = new int[n/2];
        int[] onlyNeg = new int[n/2];

        int i=0;
        int j=0,k=0;
        while(i < n){
            if(nums[i] > 0){
                onlyPos[j] = nums[i];
                j++;
            }
            else{
                onlyNeg[k] = nums[i];
                k++;
            }
        i++;
        }
    int[] arr = new int[n];
    arr[0] = onlyPos[0];
    arr[1] = onlyNeg[0];
    int x=1;
    for(int t=2;t<n;t++){
        if(t%2==0)
        arr[t] = onlyPos[x];
        else
        arr[t] = onlyNeg[x];
        if((t+1)%2 == 0)
        x++;
    }
    return arr;
    }
}