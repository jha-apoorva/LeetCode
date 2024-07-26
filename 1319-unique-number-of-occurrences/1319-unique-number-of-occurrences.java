class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i : arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
        HashSet<Integer> hs = new HashSet<>(hm.values());
        if(hm.size() == hs.size())
        return true;
        else
        return false;
    }
}