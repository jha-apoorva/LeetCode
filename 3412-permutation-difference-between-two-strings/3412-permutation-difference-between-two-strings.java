class Solution {
    public int findPermutationDifference(String s, String t) {
        int pd=0;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j])
                pd+=Math.abs(i-j);
            }
        }
    return pd;
    }
}