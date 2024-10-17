class Solution {
    public int maximumSwap(int num) {
        char[] digits = Integer.toString(num).toCharArray();
        int[] last = new int[10];

        for(int i=0;i<digits.length;i++){
            last[digits[i]-'0'] = i;
        }
        for(int i=0;i<digits.length;i++){
            for(int j=9;j>digits[i]-'0';j--){
                if(last[j] > i){
                    char temp = digits[i];
                    digits[i] = digits[last[j]];
                    digits[last[j]] = temp;

                    return Integer.parseInt(new String(digits));
                }
            }
        }
    return num;
    }
}