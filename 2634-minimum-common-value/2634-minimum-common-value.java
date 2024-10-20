class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i : nums1){
            hs.add(i);
        }
        for(int i : nums2){
            if(hs.contains(i)) return i;
        }
    return -1;
    }
}