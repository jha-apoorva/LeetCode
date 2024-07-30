class Solution {
    public boolean isSameAfterReversals(int num) {
        int n = num;
        int reversed1 = 0;
        while(n != 0){
            int digit = n%10;
            reversed1 = reversed1*10 + digit;
            n/=10;
        }
        int reversed2 = 0;
        while(reversed1 != 0){
            int digit = reversed1%10;
            reversed2 = reversed2*10 + digit;
            reversed1/=10;
        }
        return reversed2==num;
    }
}