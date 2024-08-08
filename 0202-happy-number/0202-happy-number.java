class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        for(int i=0;i<100;i++){
            while(n > 0){
            int digit = n%10;
            sum += digit*digit;
            n /= 10;
        }
        n=sum;
        if(sum == 1) break;
        sum=0;
        }
       
    return sum==1;
    }
}