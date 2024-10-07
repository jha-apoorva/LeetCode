class Solution {
    public String toHex(int num) {
        //return Integer.toHexString(num);
        if(num == 0) return "0";
        long n = num;
        if(num < 0) n = (long)(Math.pow(2,32)+num);
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            int hex = (int) (n%16);
            n /= 16;
            if(hex > 9) sb.append((char)(hex+87));
            else sb.append(hex);
        }
        return sb.reverse().toString();
    }
}