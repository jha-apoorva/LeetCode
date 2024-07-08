class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i : nums1){
            for(int j:nums2){
                if(i==j && !arr.contains(j))
                arr.add(j);
            }
        }
    int[] res = new int[arr.size()];
    for(int i=0;i<res.length;i++){
        res[i] = arr.get(i);
    }
    return res;
    }
}