class Solution {
    public String truncateSentence(String s, int k) {
        String str = "";
        String[] arr = s.split(" ");
        str += arr[0];
        for(int i=1;i<k;i++){
            str += " "+arr[i];
        }
    return str;
    }
}