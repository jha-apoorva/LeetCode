class Solution {
    public int findNthDigit(int n) {
        int start = 1;
        int l= 1;
        long count = 9;

        while(n > l*count){
            n -= l*count;
            l += 1;
            count *= 10;
            start *= 10;
        }
        start +=  (n-1)/l;
        String num = Integer.toString(start);
        return Character.getNumericValue(num.charAt((n-1)%l));
    }
}