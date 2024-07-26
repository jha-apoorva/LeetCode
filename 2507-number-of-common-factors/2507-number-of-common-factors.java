class Solution {
    public int commonFactors(int a, int b) {
        int min = Math.min(a,b);
        int max = Math.max(a,b);
        int count = 1;
        
        for(int i=2;i<=min;i++){
            if(max%i == 0 && min%i==0)
            count++; 
        }
    return count;
    }
}