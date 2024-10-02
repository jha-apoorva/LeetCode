class Solution {
    public boolean canArrange(int[] arr, int k) {
        int n = arr.length;
        int[] freq = new int[k];
        for(int x : arr){
            int i = ((x%k)+k)%k;
            freq[i]++;
        }
        if(freq[0] % 2 != 0) return false;
        for(int i=1;i<=k/2;i++){
            if(i != k-i){
                if(freq[i] != freq[k-i]){
                    return false;
                }
            }
            else{
                if(freq[i]%2 != 0){
                    return false;
                }
            }
        }
    return true;
    }
}