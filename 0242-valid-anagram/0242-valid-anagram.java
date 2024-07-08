import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == t.length()){
            char[] S = s.toCharArray();
            char[] T = t.toCharArray();
            Arrays.sort(S);
            Arrays.sort(T);
            return Arrays.equals(S,T);

        }
        return false;
    }
}