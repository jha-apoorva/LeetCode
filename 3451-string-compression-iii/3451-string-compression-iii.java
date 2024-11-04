class Solution {
    public String compressedString(String word) {
        StringBuilder comp = new StringBuilder();
        int count = 1;
        int n = word.length();
        char ch = word.charAt(0);

        for(int i=1;i<n;i++){
            if(word.charAt(i) == ch && count < 9){
                count++;
            }
            else {
                comp.append(count).append(ch);
                ch = word.charAt(i);
                count = 1;
            }
        }
    comp.append(count).append(ch);
    return comp.toString();
    }
}