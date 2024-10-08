class Solution {
    public int minSwaps(String s) {
        int openBrackets = 0, closeBrackets = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch ==']'){
                openBrackets++;
            }
            else{
                openBrackets--;
            }
            closeBrackets = Math.max(openBrackets,closeBrackets);
        }
        return (closeBrackets+1)/2;
    }
}