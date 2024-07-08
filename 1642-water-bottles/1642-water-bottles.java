class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int max = numBottles;
        while(numBottles >= numExchange){
            int count = numBottles/numExchange;
            max += count;
            int temp = numBottles%numExchange;
            numBottles = count+temp;
        }
    return max;
    }
}