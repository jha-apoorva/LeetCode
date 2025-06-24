class Solution {
    public String replace(String str,char fill) {
        char tgt = '\0';
        for(char ch : str.toCharArray()){
            if(ch != fill) {
                tgt = ch;
                break;
            }
        }
        return new String(str).replace(tgt,fill);
    }
    public int minMaxDifference(int num) {
        String str = String.valueOf(num);
        String max = replace(str,'9');
        String min = replace(str,'0');

        return Integer.parseInt(max)-Integer.parseInt(min);
        
        
    }
}