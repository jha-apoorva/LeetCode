class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        HashSet<Integer> res = new HashSet<>();
        List<Integer> keyEle = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n;i++) {
            if(nums[i] == key) keyEle.add(i);
        }
        for(int i=0;i<n;i++){
            for(int num : keyEle) {
                if(Math.abs(i-num) <= k) res.add(i);
            }
        }
        ArrayList<Integer> lst = new ArrayList<>(res);
        Collections.sort(lst);
        return lst;
    }
}