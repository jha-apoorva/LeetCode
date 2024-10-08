class Solution {
    public String multiply(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int[] product = new int[n1+n2];

        for(int i=n1-1;i>=0;i--){
            for(int j=n2-1;j>=0;j--){
                int multiply = (num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum = multiply + product[i+j+1];

                product[i+j+1] = sum%10;
                product[i+j] += sum/10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int num : product){
            if(!(sb.length() == 0 && num == 0)){
                sb.append(num);
            }
        }
    return sb.length() == 0 ? "0":sb.toString();
    }
}