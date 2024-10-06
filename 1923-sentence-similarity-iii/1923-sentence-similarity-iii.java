class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length()>sentence2.length()){
            return areSentencesSimilar(sentence2,sentence1);
        }
        String[] smallString = sentence1.split(" ");
        String[] largeString = sentence2.split(" ");
        int start = 0;
        int end1=smallString.length-1;
        int end2=largeString.length-1;

        while(start<=end1 && smallString[start].equals(largeString[start])){
            start++;
        }
        while(start<=end1 && smallString[end1].equals(largeString[end2])){
            end1--;
            end2--;
        }
        return start>end1;
    }
}