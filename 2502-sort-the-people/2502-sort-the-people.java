class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        String[] ans = new String[n];
        int index = 0;
        for(int i=n-1;i>=0;i--){
            ans[index] = map.get(heights[i]);
            index++;
        }
    return ans;
    }
}