class Solution {

    public String[] divideString(String s, int k, char fill) {
        if(s.length()%k != 0) {
            for(int i=0;i<s.length()%k;i++){
                s = s+fill;
            }
        }
        int numSubStrings = s.length()/k;
        String[] res = new String[numSubStrings];
        for(int i=0,j=0;i<s.length();i+=k,j++){
            res[j] = s.substring(i,i+k);
        }
    return res;   
    }
}