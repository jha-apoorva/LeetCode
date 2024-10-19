class Solution {
    public boolean isSelfDivisible(int num){
        int temp = num;
        while(temp > 0){
            int digit = temp%10;
            if(digit==0) return false;
            else if(num%digit != 0) return false;
            temp /= 10;
        }
    return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lst = new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isSelfDivisible(i)) lst.add(i);
        }   
        return lst;
    }
}