class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0;i<details.length;i++){
         //   String substr = details[i].substring(11,13);
            int age = (details[i].charAt(11)-'0')*10 + (details[i].charAt(12)-'0');
            if(age > 60)
            count++;
        }
    return count;
    }
}