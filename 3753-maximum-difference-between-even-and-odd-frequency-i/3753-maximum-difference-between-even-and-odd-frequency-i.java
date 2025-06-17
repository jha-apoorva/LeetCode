class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c : s.toCharArray()){
            if (hm.containsKey(c)) hm.put(c,hm.get(c)+1);
            else hm.put(c,1);
        }
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;
        for(Integer val : hm.values()) {
            if(val%2 != 0 && val > maxOdd) maxOdd = val;
            else if (val%2 == 0 && val < minEven) minEven = val;
        }
    return maxOdd-minEven;
    }
}