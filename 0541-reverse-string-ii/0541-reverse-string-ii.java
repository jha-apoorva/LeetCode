class Solution {
    public void reverse(char[] arr,int start,int end){
        while(start<end){
            char temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i=0;i<n;i+=2*k){
            int end = Math.min(i+k-1,n-1);
            reverse(arr,i,end);
        }
    return new String(arr);
    }
}