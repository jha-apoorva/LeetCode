class Solution {
    public int maximumGain(String s, int x, int y) {
        if(x > y){
            return maximumGainer(s,'a','b',x,y);
        }
        else{
            return maximumGainer(s,'b','a',y,x);
        }
    }
    private int maximumGainer(String s,char first,char second,int firstPoints,int secondPoints){
        int totalPoints = 0;
        StringBuilder sb = new StringBuilder();

        for(char c : s.toCharArray()){
            if(sb.length() > 0 && sb.charAt(sb.length()-1) == first && c==second){
                sb.deleteCharAt(sb.length()-1);
                 totalPoints += firstPoints;
            }else{
            sb.append(c);
        }    
        }
        String intermediate = sb.toString();
        sb.setLength(0);
        for(char c : intermediate.toCharArray()){
            if(sb.length() > 0 && sb.charAt(sb.length()-1) == second && c == first ){
                sb.deleteCharAt(sb.length()-1);
                 totalPoints += secondPoints;
            }else{
            sb.append(c);
        }    
        }
    return totalPoints;
    }
}