class Solution {
    public boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int count = 0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                count++;
            }
        }
        int maxCount = count;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i-k))){
                 count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
            }
            maxCount = Math.max(count,maxCount);
        }
    return maxCount;
    }
}