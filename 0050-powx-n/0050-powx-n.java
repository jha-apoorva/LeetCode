class Solution {
    public double myPow(double x, int n) {
        double ans = 1.0;
        long num=n;
        if(num<0) num = -1*num;
        while(num > 0){
            if(num%2==1){
                ans *= x;
                num--;
            }
            else{
                x *= x;
                num /= 2;
            }
        }
        ans = n>0?ans:1.0/ans;
        return ans;
    }
}