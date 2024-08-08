class Solution {
    public int minimumPushes(String word) {
       /*int count=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : word.toCharArray()){
            if(hm.containsKey(ch)) hm.put(ch,hm.get(ch)+1);
            else hm.put(ch,1);
        }
        List<Map.Entry<Character,Integer>> lst = new LinkedList<>(hm.entrySet());
        lst.sort(Map.Entry.<Character,Integer>comparingByValue().reversed());
        LinkedHashMap<Character,Integer> lhm = new LinkedHashMap<>();
        for(Map.Entry<Character,Integer> i : lst)
            lhm.put(i.getKey(),i.getValue());
        
        int index=1;
        for(int i : lhm.values()){
            if(index <= 8) i *= 1;
            else if(index <= 16) i *= 2;
            else if(index <= 24) i *= 3;
            else i *= 4;
            count += i;
        index++;    
        }
    return count; */
    int[] arr = new int[26];
    for(int i=0;i<word.length();i++){
        arr[word.charAt(i)-'a']++;
    }
    Arrays.sort(arr);
    int index=0;
    int count=0;
    for(int i=25;i>=0;i--){
        if(index < 8) arr[i]*=1;
        else if(index < 16) arr[i]*=2;
        else if(index < 24) arr[i]*=3;
        else arr[i]*=4;
        count+=arr[i];
        index++;
    }
    return count;
    }
}