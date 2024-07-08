class Solution {
    public int countDigits(int num) {
        int n = num;
        int val = 0;
        while(num != 0){
            int digit = num%10;
            if(n % digit == 0){
                val++;
            }
            num /= 10;
        }
    return val;
    }
}