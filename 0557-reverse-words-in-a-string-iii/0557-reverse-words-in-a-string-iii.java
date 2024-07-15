class Solution {
    public String reverseWords(String s) {
         String[] words = s.split(" ");
        //System.out.println(Arrays.toString(words));
        StringBuilder sb = new StringBuilder();
        for(String w : words){
            char[] arr = w.toCharArray();
            //System.out.println(Arrays.toString(arr));
            int i=0;
           int j=arr.length-1;
        
        while(i<=j){
            char ch = arr[i];
            arr[i] = arr[j];
            arr[j] = ch;
            i++;
            j--;
        }
    sb.append(new String(arr)+" ");
    }
    return sb.toString().strip();
    }
}