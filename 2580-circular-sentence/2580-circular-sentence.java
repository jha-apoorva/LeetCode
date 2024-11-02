class Solution {
    public boolean isCircularSentence(String sentence) {
        String[] words = sentence.split(" ");
        char firstChar = words[0].charAt(0);
        char lastChar = words[words.length-1].charAt(words[words.length-1].length()-1);
        if(firstChar != lastChar) return false;
        else{
            for(int i=0;i<words.length-1;i++){
            char lastLetter = words[i].charAt(words[i].length()-1);
            char firstLetter = words[i+1].charAt(0);
            if(lastLetter != firstLetter) return false;
        }
        }
    return true;    
    }
}