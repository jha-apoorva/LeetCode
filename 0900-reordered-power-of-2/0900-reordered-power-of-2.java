class Solution {
    public boolean reorderedPowerOf2(int n) {
         String tgt = sortedString(n);
         for(int i=0;i<31;i++){
            if(sortedString(1<<i).equals(tgt))
            return true;
         }
         return false;
    }
    private String sortedString(int n) {
        char[] arr = String.valueOf(n).toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}