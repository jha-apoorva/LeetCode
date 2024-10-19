class Solution {
    public int setBits(int n){
        String str = Integer.toBinaryString(n);
        int count = 0;
        for(char ch : str.toCharArray()){
            if(ch=='1') count++;
        }
        return count;
    }
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        int[] arr = {2,3,5,7,11,13,17,19};
        for(int i=left;i<=right;i++){
            int temp = setBits(i);
            for(int prime : arr){
                if(temp==prime) ans++;
            }
        }
    return ans;    
    }
}