class Solution {
    public int minOperations(String[] logs) {
        int i=0;// let 0 represents main
        for(int j=0;j<logs.length;j++){
            if(logs[j].equals("../") && i != 0)
                i--;
            else if(logs[j].equals("../") && i == 0)
                continue;
            else if(logs[j].equals("./"))
                continue;
            else
                i++;
        }
    return i;
    }
}