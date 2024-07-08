class Solution {
    public String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder();
        int n = word.length();
        int indx=-1;
        for(int i=0;i<n;i++){
            if(word.charAt(i) == ch){
                indx = i;
                break;
            }
        }
        if(indx == -1){
            return word;
        }
        int i = indx+1;
        while(indx >= 0){
                sb.append(word.charAt(indx));
                indx--;
        }
        while(i < n){
                sb.append(word.charAt(i));
                i++;
        }
    return sb.toString();
    }
}