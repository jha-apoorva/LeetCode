class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int ans = -1;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : nums){
            int sqrt = (int) Math.sqrt(i);
            if(sqrt*sqrt == i && hm.containsKey(sqrt)){
                hm.put(i,hm.get(sqrt)+1);
                ans = Math.max(ans,hm.get(i));
            }
            else {
                hm.put(i,1);
            }
        }
    return ans;
    }
}