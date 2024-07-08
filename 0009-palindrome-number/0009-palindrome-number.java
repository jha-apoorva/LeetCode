class Solution {
    public boolean isPalindrome(int x) {
    if(x>=0){
        int temp = x;
        int rev = 0;
        while(x != 0){
            int n = x%10;
            rev = rev*10 + n;
            x = x/10;
        }
        if(rev == temp)
        return true;
        else
        return false;
    }
    else {
        return false;
    }
    }
}