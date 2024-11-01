class Solution {
    public String makeFancyString(String s) {
        StringBuilder sb = new StringBuilder();
        if(s.length()<2) return s;
        sb.append(s.charAt(0));
        sb.append(s.charAt(1));
        for(int i=2;i<s.length();i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            char prevPrev = s.charAt(i-2);
            if(curr == prev && curr == prevPrev){
                continue;
            }
            else{
                sb.append(curr);
            }
        }
    return sb.toString();
    }
}