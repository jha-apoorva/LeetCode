class Solution {
    public boolean isConsistent(String allowed,String word){
        HashSet<Character> hs = new HashSet<>();
        for(char c : allowed.toCharArray()){
            hs.add(c);
        }
          for(char ch : word.toCharArray()){
                if(!hs.contains(ch)) 
                    return false;
            }
        return true;
    }
    public int countConsistentStrings(String allowed, String[] words) {
        
        int count=0;
        for(String word : words){
            if(isConsistent(allowed,word)) count++;   
        }
    return count;
    }
}