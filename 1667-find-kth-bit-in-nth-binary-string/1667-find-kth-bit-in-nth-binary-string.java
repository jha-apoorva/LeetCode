class Solution {
    public char recursiveCall(int len,int k){
        if(len==1) return '0';
        int mid = (len/2)+1;
        if(k==mid) return '1';
        else if(k<mid) return recursiveCall(len/2,k);
        else{
            char ch = recursiveCall(len/2,len+1-k);
            return ch=='0'?'1':'0';
        }
    }
    public char findKthBit(int n, int k) {
        int len = (int)Math.pow(2,n)-1;
        return recursiveCall(len,k);
    }
}