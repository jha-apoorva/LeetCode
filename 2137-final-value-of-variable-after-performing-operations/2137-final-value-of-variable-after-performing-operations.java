class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X = 0;
        /*for(int i=0;i<operations.length;i++){
            if(operations[i].equals("X++") || operations[i].equals("++X")){
                X += 1;
            }
            else {
                X -= 1;
            }
        }*/
        for(String a : operations){
            if(a.charAt(0) == '-' || a.charAt(1) == '-'){
                X -= 1;
            }
            else{
                X += 1;
            }
        }
    return X;
    }
}