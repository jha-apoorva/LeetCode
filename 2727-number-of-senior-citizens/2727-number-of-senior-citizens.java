class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++){
            String substr = details[i].substring(11,13);
            int age = (substr.charAt(0)-'0')*10 + (substr.charAt(1)-'0');
            if(age > 60)
            count++;
        }
    return count;
    }
}