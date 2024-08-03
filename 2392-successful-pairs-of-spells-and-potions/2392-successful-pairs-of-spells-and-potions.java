class Solution {
    public int binarySearch(int[] arr,int k,long target){
        int i=0;
        int j=arr.length-1;
        while(i <= j){
            int mid = i + (j-i)/2;
            long prod = arr[mid] * (long)k;
            if(prod >= target)
            j=mid-1;
            else
            i=mid+1;
        }
        return i < arr.length ? i : -1;

    }
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] pairs = new int[n];
        Arrays.sort(potions);
        for(int i=0;i<n;i++){
            int indx = binarySearch(potions,spells[i],success);
            if(indx!=-1) pairs[i] = m-indx;
            else pairs[i] = 0;
        }
    return pairs;
    }
}