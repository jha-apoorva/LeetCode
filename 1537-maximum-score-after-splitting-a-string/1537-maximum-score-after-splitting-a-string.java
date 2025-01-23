class Solution {
    public int maxScore(String s) {
        int totalOnes=0;
        for(char a : s.toCharArray()){
            if(a=='1') totalOnes++;
        }
        int max = 0;
        int zero = 0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='0') zero++;
            else totalOnes--;

            max = Math.max(max,totalOnes+zero);
        }
    return max;
    }
}