class Solution {
    public int minLength(String s) {
        boolean found = true;
        while(found){
            found = false;
            if(s.contains("AB")){
                s = s.replaceFirst("AB","");
                found = true;
            }
             if(s.contains("CD")){
                s = s.replaceFirst("CD","");
                found = true;
            }
        }
    return s.length();
    }
}