class Solution {
    public String firstCharToLast(String s){
        if(s == null || s.length() <= 1)
            return s;
        return s.substring(1) + s.charAt(0);
    }
    public boolean rotateString(String s, String goal) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        for(int i=0;i<n;i++){
            String temp = firstCharToLast(s);
            s = temp;
            if(temp.equals(goal))   
                return true;
        }
    return false;
    }
}