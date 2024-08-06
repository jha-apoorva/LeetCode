class Solution {
    public boolean canAliceWin(int[] nums) {
        int sumSingle=0;
        int sumDouble=0;
        for(int i : nums){
            if(i<=9) sumSingle += i;
            else if(i<=99) sumDouble += i;
        }
    return sumSingle!=sumDouble;
    }
}