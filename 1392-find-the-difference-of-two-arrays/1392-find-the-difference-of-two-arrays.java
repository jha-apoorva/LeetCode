class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>(2);
        List<Integer> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        Set<Integer> hs1 = new HashSet<>();
        for(int i:nums1) hs1.add(i);
        Set<Integer> hs2 = new HashSet<>();
        for(int i:nums2) hs2.add(i);
        for(int i : hs1){
            if(!hs2.contains(i)){
                arr1.add(i);
            }
        }
        for(int i : hs2){
            if(!hs1.contains(i)){
                arr2.add(i);
            }
        }
        ans.add(arr1);ans.add(arr2);
        return ans;
    }
}