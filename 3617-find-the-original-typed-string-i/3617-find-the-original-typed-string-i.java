class Solution {
    public int possibleStringCount(String word) {
        List<Integer> groupLengths = new ArrayList<>();
        
        int i = 0;
        while (i < word.length()) {
            int j = i;
            while (j < word.length() && word.charAt(j) == word.charAt(i)) {
                j++;
            }
            groupLengths.add(j - i);
            i = j;
        }

        // Step 2: Count all possible originals
        // 1 for the original word (no fix)
        int total = 1;

        // For each group, if it was the "held key" group, how many other valid versions?
        for (int len : groupLengths) {
            if (len > 1) {
                total += (len - 1);  // reducing to length 1, 2, ..., len-1
            }
        }

        return total;
    }
}