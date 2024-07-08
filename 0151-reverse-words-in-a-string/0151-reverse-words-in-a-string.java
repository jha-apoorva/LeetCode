import java.util.*;
class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] parts = s.split("\\s+");
        
        int i=0,j=parts.length-1;
        
        while(i < j){
            String temp = parts[i];
            parts[i] = parts[j];
            parts[j] = temp;
            i++;
            j--;
        }
        return String.join(" ",parts);
    }
}