class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count=0;
        int i=0;
        if(i==0 && flowerbed[i] == 0 && (flowerbed.length == 1 ||flowerbed[i+1] == 0 )){
            count += 1;
            flowerbed[0] = 1;
         }
         for(i=0;i<=flowerbed.length-1;i++){
if((i>0 && i<flowerbed.length-1)&& (flowerbed[i]==0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0)){
                count += 1;
                flowerbed[i] = 1;
            }
            if(i==flowerbed.length-1 && flowerbed[i] == 0 && flowerbed[i-1] == 0){
            count += 1;
            flowerbed[i] = 1;
         }
         }

         if(count >= n){
            return true;
         }
        
    return false;
        
    }
}