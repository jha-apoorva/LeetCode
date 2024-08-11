class Solution {
    public String kthDistinct(String[] arr, int k) {
          Map<String,Integer> hm = new LinkedHashMap<>();
        for(String str : arr){
            if(hm.containsKey(str))
            hm.put(str,hm.get(str)+1);
            else
            hm.put(str,1);
        }
        for(String i : hm.keySet()) {
            if(hm.get(i)==1) k--;
            if(k==0)
                return i;
        }
    return "" ;  
    }
}