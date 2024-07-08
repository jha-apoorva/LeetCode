import java.util.*;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> arr = new ArrayList<>();
        int max = candies[0];
        for(int i=0; i<candies.length;i++){
            if(candies[i] > max){
                max = candies[i];
            }
        }
        for(int i=0; i<candies.length;i++){
            if(candies[i] + extraCandies >= max){
                arr.add(true);
            }
            else{
                arr.add(false);
            }
        }
        return arr;
    }
}