class Solution {
    public int minimumDeletions(String word, int k) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : word.toCharArray()) {
            if(hm.containsKey(ch)) {
                hm.put(ch,hm.get(ch)+1);
            } else {
                hm.put(ch,1);
            }
        }
      ArrayList<Integer> arr = new ArrayList<>(hm.values());
      int ans = Integer.MAX_VALUE;
      for(int base : arr) {
        int del = 0;
        for (int f : arr) {
            if(f < base) {
                del += f;
            } else if (f > base + k) {
                del += (f-base-k);
            }
        }
        ans = Math.min(ans,del);
      }
    return ans;
    }
}