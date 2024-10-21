class Solution {
    int maxCount=0;
    public int maxUniqueSplit(String s) {
        maxCount=0;
        HashSet<String> hs = new HashSet<>();
        backtrack(s,hs,0);
        return maxCount;

    }
        public void backtrack(String s, HashSet<String> hs,int index){
        if(index==s.length()){
            maxCount = Math.max(maxCount,hs.size());
            return;
        }
        for(int i=index;i<s.length();i++){
            String substr = s.substring(index,i+1);
            if(!hs.contains(substr)){
                hs.add(substr);
                backtrack(s,hs,i+1);
                hs.remove(substr);
            }
        }
    }
}