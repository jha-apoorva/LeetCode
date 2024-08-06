class Solution {
    public int mostWordsFound(String[] sentences) {
      int n = sentences.length;
        int maxSpaces = 0;
        for(int i=0;i<n;i++){
            int spaces = 0;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].charAt(j)==' ')
                spaces +=1;
            }
        maxSpaces = Math.max(spaces,maxSpaces);
        }
    return maxSpaces+1;  
    }
}