class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> lst = new ArrayList<>();
        
        for(int i=left;i<=right;i++){
            int count=0;
            char[] arr = Integer.toString(i).toCharArray();
            for(int j=0;j<arr.length;j++){
                if(arr[j]=='0') break;
                else if((i%(arr[j]-'0'))==0){
                    count++;
                }
            }
            if(count==arr.length) lst.add(i);
        }
        return lst;
    }
}