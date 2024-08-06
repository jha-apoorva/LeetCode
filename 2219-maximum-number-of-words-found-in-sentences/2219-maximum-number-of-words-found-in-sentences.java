class Solution {
    public int mostWordsFound(String[] sentences) {
      int n = sentences.length;
        int maxSpaces = 0;
        for(String str : sentences){
            int spaces = 0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)==' ')
                spaces +=1;
            }
        maxSpaces = Math.max(spaces,maxSpaces);
        }
    return maxSpaces+1;  
    }
}