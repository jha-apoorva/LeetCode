class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> hm1 = new HashMap<>();
        for(String str : s1.split(" ")){
            if(hm1.containsKey(str))
                hm1.put(str,hm1.get(str)+1);
            else
                hm1.put(str,1);
        }
        HashMap<String,Integer> hm2 = new HashMap<>();
        for(String str : s2.split(" ")){
            if(hm2.containsKey(str))
                hm2.put(str,hm2.get(str)+1);
            else
                hm2.put(str,1);
        }
        //System.out.println(hm1);
        //System.out.println(hm2);
        ArrayList<String> arr = new ArrayList<>();
        for(String i : hm1.keySet()){
            if(hm1.get(i) == 1 && !hm2.containsKey(i))
                arr.add(i);
        }
        for(String i : hm2.keySet()){
            if(hm2.get(i) == 1 && !hm1.containsKey(i))
                arr.add(i);
        }
    //System.out.println(arr);
    return arr.toArray(new String[0]);
    }
}