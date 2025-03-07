class Solution {
    public List<Integer> sievePrimes(int left , int right){
        boolean primes[] = new boolean[right+1];
        for(int i=2;i<=right;i++){
            primes[i] = true;
        }
        List<Integer> lst = new ArrayList<>();
        for(int i=2; i*i <= right ; i++){
            if(primes[i]){
                for(int j = i*i ; j <= right ; j += i){
                    primes[j] = false;
                }
            }
        }
        for(int i = left ; i <= right ; i++){
            if(primes[i]) lst.add(i);
        }
    return lst;
    }
    public int[] closestPrimes(int left, int right) {
        List<Integer> lst = new ArrayList<>();
        lst = sievePrimes(left,right);
        int[] arr = new int[lst.size()];
        for(int i=0;i<arr.length;i++){
           arr[i] = lst.get(i);
       }
       int[] res = new int[2];
       res[0] = -1; res[1] = -1;
       if(arr.length < 2) return res;

       int minDiff = Integer.MAX_VALUE;
       for(int num = 0 ; num<arr.length-1;num++){
           int diff = arr[num+1]-arr[num];
           if(diff < minDiff){
               minDiff = diff;
               res[0] = arr[num];
               res[1] = arr[num+1];
           }    
       }
       return res;
    }
}