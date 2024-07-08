class Solution {
    static boolean isEven(int num){
        int count = 0;
        while(num > 0){
            count ++;
            num /= 10;
        }
        if(count % 2 == 0)
        return true;
    return false;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0; i< nums.length; i++){
            if(isEven(nums[i]))
              count ++;
        }
        return count;
    }
}
   