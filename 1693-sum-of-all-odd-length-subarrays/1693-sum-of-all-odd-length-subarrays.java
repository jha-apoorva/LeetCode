class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int count=0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j+=2){
                count+=arr[j];
                for(int k=i;k<j;k++){
                    count+=arr[k];
                        }
                    }
                }
    return count;    
    }
}