class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        HashMap<Integer,Integer> hm = new HashMap<>();
        int rank=1;
        for(int num : sorted){
            if(!hm.containsKey(num)){
                hm.put(num,rank++);
            }
        }
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i] = hm.get(arr[i]);
        }
    return ans;
    }
}