class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int i=0;
        int[] ans = new int[num_people];
        while(candies != 0){
            ans[i++ % num_people] += Math.min(i,candies);
            candies = Math.max(candies-i,0);
        }
    return ans;
    }
}