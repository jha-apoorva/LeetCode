class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        /*HashSet<Integer> hs = new HashSet<>();
        for(int i : nums1){
            hs.add(i);
        }
        for(int i : nums2){
            if(hs.contains(i)) return i;
        }
    return -1;*/
    int i=0;
    int j=0;
    while(i < nums1.length && j < nums2.length){
        if(nums1[i]==nums2[j]) return nums1[i];
        else if(nums1[i]>nums2[j]) j++;
        else i++;
    }
     return -1;
    }
}