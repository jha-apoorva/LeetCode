class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0;
        int j=1;
        while(i < arr.length){
            if(j == arr[i]){
                i++;    
            }
            else{
                k--;  
                if(k==0)
                return j;
            }
            j++;
            //System.out.println(i+" "+j+" "+count);
        }
    return arr[arr.length-1]+k;
    }
}