class Solution {
    /*public boolean isVowel(char ch){
        char[] vowels = {'a','e','i','o','u'};
        for(char i : vowels){
            if(ch==i) return true;
        }
    return false;
    }
    public boolean startsAndEndWithVowel(String s){
        char first = s.charAt(0);
        char last = s.charAt(s.length()-1);
        if(isVowel(first) && isVowel(last)) {
            return true;
        }
    return false; 
    }
    public int noOfStrings(String[] words,int startIndex,int endIndex){
        int ans = 0;
        for(int i=startIndex;i<=endIndex;i++){
            if(startsAndEndWithVowel(words[i])) ans++;
        }
    return ans;   
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
                ans[i] = noOfStrings(words,queries[i][0],queries[i][1]);
            }
        return ans;
        }*/
     public boolean isVowel(char ch){
        char[] vowels = {'a','e','i','o','u'};
        for(char i : vowels){
            if(ch==i) return true;
        }
    return false;
    }
    public int startsAndEndWithVowel(String s){
        char first = s.charAt(0);
        char last = s.charAt(s.length()-1);
        if(isVowel(first) && isVowel(last)) {
            return 1;
        }
    return 0; 
    }
     public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] prefixSum = new int[n];
        prefixSum[0] = startsAndEndWithVowel(words[0]);
        for(int i=1;i<n;i++){
            prefixSum[i] = prefixSum[i-1] + startsAndEndWithVowel(words[i]);
        }
        int len = queries.length;
        int[] ans = new int[len];
        for(int i=0;i<len;i++){
            int l = queries[i][0];
            int r = queries[i][1];
            if(l==0) ans[i] = prefixSum[r];
            else ans[i] = prefixSum[r] - prefixSum[l-1];
        }
    return ans;
     }
}